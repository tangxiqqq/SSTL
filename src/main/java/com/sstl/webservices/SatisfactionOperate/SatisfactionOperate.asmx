<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://tempuri.org/" xmlns:s1="http://microsoft.com/wsdl/types/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/">
      <s:import namespace="http://microsoft.com/wsdl/types/" />
      <s:element name="Submit">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Password" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="LmTeSatisfaction" type="tns:LmTeSatisfaction" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="LmTeSatisfaction">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="iid" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
          <s:element minOccurs="0" maxOccurs="1" name="company_name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="project_code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="project_name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="item" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="improvement" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="other_improvement" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="mobile" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="insert_dt" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="version" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="tag1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag5" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag6" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="SubmitResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SubmitResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://microsoft.com/wsdl/types/">
      <s:simpleType name="guid">
        <s:restriction base="s:string">
          <s:pattern value="[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}" />
        </s:restriction>
      </s:simpleType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="SubmitSoapIn">
    <wsdl:part name="parameters" element="tns:Submit" />
  </wsdl:message>
  <wsdl:message name="SubmitSoapOut">
    <wsdl:part name="parameters" element="tns:SubmitResponse" />
  </wsdl:message>
  <wsdl:portType name="SatisfactionOperateSoap">
    <wsdl:operation name="Submit">
      <wsdl:input message="tns:SubmitSoapIn" />
      <wsdl:output message="tns:SubmitSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="SatisfactionOperateSoap" type="tns:SatisfactionOperateSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="Submit">
      <soap:operation soapAction="http://tempuri.org/Submit" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="SatisfactionOperateSoap12" type="tns:SatisfactionOperateSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="Submit">
      <soap12:operation soapAction="http://tempuri.org/Submit" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="SatisfactionOperate">
    <wsdl:port name="SatisfactionOperateSoap" binding="tns:SatisfactionOperateSoap">
      <soap:address location="http://192.168.250.54:7070/WebServices/WeChat/SatisfactionOperate.asmx" />
    </wsdl:port>
    <wsdl:port name="SatisfactionOperateSoap12" binding="tns:SatisfactionOperateSoap12">
      <soap12:address location="http://192.168.250.54:7070/WebServices/WeChat/SatisfactionOperate.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>