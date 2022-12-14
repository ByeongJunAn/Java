package com.keduit;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class anTest {

	List<anVO> list = new ArrayList<>();

	public static void main(String[] args) {
		anTest st = new anTest();
		st.an();

	}

	private void an() {

		anDAO dao = anDAO.newInstance();

		try {
			for (int i = 1; i < 50; i++) {

				Document doc = Jsoup.connect("https://ampos.nanet.go.kr:7443/materialSeminarTotalList.do?searchTab=10#queryText=&queryGubun=&searchTab=10&pageNum=1&orderParam=SORT_HOST_DT_FROM_DESC&strInstitution=&strInstituEtc=&strName1=&strName2=&strTerm=&strTitle=&flag=&userDiv=&searchCheck=&assemblyTh=&sDate=&eDate=&commitName=&partyNm=&institution=&themeNm=%EB%AC%B8%ED%99%94&curPage=" + i).get();
				Elements title = doc.select("p.listTitle.btn_title_detail");
				Elements link = doc.select("div.listForm div.listTxt");
				
				
				
				for (int j = 0; j < title.size(); j++) {

					System.out.println("번호 : " + j);
					System.out.println("세미나 제목 : " + title.get(j).text());
					

					Document doc_s = Jsoup.connect("https://ampos.nanet.go.kr:7443/materialSeminarDetail.do?control_no=" + link.get(j).attr("id")).get();
					Elements date = doc_s.select("ul.liStyle.fullText li:eq(0) span:eq(0) #text");
					Elements place = doc_s.select("ul.liStyle.fullText li:eq(1) span:eq(1) #text");
					Elements host = doc_s.select("ul.liStyle.fullText li:eq(2) span:eq(2) #text");
					Elements presenter = doc_s.select("ul.liStyle.fullText li:eq(3) span:eq(3) #text");

					System.out.println("일시: " + date.text());
					System.out.println("장소: " + place.text());
					System.out.println("주최: " + host.text());
					System.out.println("발제자: " + presenter.text());
					System.out.println("------------------------------------------------------------------");


					anVO vo = new anVO();

					vo.setNo(j);
					vo.setTitle(title.get(j).text());
					vo.setdate(date.text());
					vo.setplace(place.text());
					vo.sethost(host.text());
					vo.setpresenter(presenter.text());
					dao.anInsert(vo);

				
				}
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}