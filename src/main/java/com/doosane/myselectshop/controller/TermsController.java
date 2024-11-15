package com.doosane.myselectshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TermsController {

    @GetMapping("/api/user/terms")
    public String getTerms() {
        String termsKorean = "<h2>서비스 이용 약관</h2>" +
                "<h3>제 1 조 (목적)</h3>" +
                "<p>본 약관은 사용자(이하 \"회원\")가 네이버 검색 API를 이용하여 검색한 상품을 등록, 저장, 관리하고, 생성된 폴더를 통해 상품 정보를 조회하거나 관리할 수 있는 서비스(이하 \"서비스\")를 제공함에 있어, 회사와 회원 간의 권리, 의무, 책임사항, 서비스 이용 절차 등 기본적인 사항을 규정함을 목적으로 합니다.</p>" +
                "<h3>제 2 조 (용어 정의)</h3>" +
                "<p>\"회원\"은 본 약관에 동의하고 서비스를 이용하는 자를 말합니다.<br>" +
                " \"서비스\"는 네이버 검색 API를 이용하여 상품을 검색, 저장, 관리하는 모든 기능을 포함합니다.<br>" +
                " \"폴더\"는 회원이 생성하여 상품 정보를 저장하는 관리 단위를 의미합니다.</p>" +
                "<h3>제 3 조 (회원가입 및 계정 관리)</h3>" +
                "<p>회원은 본 약관에 동의함으로써 서비스 이용 자격을 얻습니다.<br>" +
                " 회원은 서비스 이용 시 허위 정보를 제공하지 않아야 합니다.</p>" +
                "<h3>제 4 조 (서비스 제공 및 제한)</h3>" +
                "<p>회사는 회원에게 상품 등록, 저장, 조회 및 관리 기능을 제공합니다.<br>" +
                " 네이버 검색 API의 정책 변경 또는 장애로 인해 서비스 이용이 제한될 수 있습니다.</p>" +
                "<h3>제 5 조 (데이터 저장 및 사용)</h3>" +
                "<p>회원이 저장한 데이터는 회원 본인만 열람 및 관리할 수 있습니다.<br>" +
                " 회사는 저장된 데이터를 광고 목적으로 사용하거나 외부에 제공하지 않습니다.</p>" +
                "<h3>제 6 조 (회원의 의무)</h3>" +
                "<p>회원은 네이버 검색 API의 정책을 준수해야 합니다.<br>" +
                " 회원은 서비스를 불법적인 목적으로 이용할 수 없습니다.</p>" +
                "<h3>제 7 조 (면책 조항)</h3>" +
                "<p>회사는 네이버 API 장애, 네트워크 문제, 또는 천재지변으로 인한 서비스 중단에 대해 책임지지 않습니다.<br>" +
                " 회원의 귀책 사유로 인해 발생한 손해는 회원 본인이 부담합니다.</p>";

        String termsEnglish = "<h2>Terms of Service</h2>" +
                "<h3>Article 1 (Purpose)</h3>" +
                "<p>These Terms of Service (hereinafter referred to as \"Terms\") aim to define the rights, obligations, responsibilities, and procedures for users (hereinafter referred to as \"Members\") who utilize the service that enables product registration, storage, and management using the Naver Search API.</p>" +
                "<h3>Article 2 (Definitions)</h3>" +
                "<p>\"Member\" refers to anyone who agrees to these Terms and uses the service.<br>" +
                " \"Service\" includes all functions for searching, saving, and managing products via the Naver Search API.<br>" +
                " \"Folder\" refers to a management unit created by the Member to save product information.</p>" +
                "<h3>Article 3 (Membership and Account Management)</h3>" +
                "<p>Members acquire service access by agreeing to these Terms.<br>" +
                " Members must provide accurate information when using the service.</p>" +
                "<h3>Article 4 (Service Provision and Limitations)</h3>" +
                "<p>The Company provides product registration, storage, viewing, and management features to Members.<br>" +
                " Service availability may be limited due to changes in Naver Search API policies or system failures.</p>" +
                "<h3>Article 5 (Data Storage and Usage)</h3>" +
                "<p>Data saved by Members is accessible and manageable only by the Member.<br>" +
                " The Company will not use stored data for advertising purposes or share it externally.</p>" +
                "<h3>Article 6 (Member Obligations)</h3>" +
                "<p>Members must comply with the policies of the Naver Search API.<br>" +
                " Members must not use the service for unlawful purposes.</p>" +
                "<h3>Article 7 (Disclaimer)</h3>" +
                "<p>The Company is not liable for service interruptions caused by Naver API failures, network issues, or natural disasters.<br>" +
                " Members are responsible for any damages caused by their own fault.</p>";

        return termsKorean + "<hr>" + termsEnglish;
    }

}
