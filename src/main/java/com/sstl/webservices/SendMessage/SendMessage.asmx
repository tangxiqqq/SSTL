<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://tempuri.org/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/">
      <s:element name="Send">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="UserName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Password" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Mobile" type="tns:ArrayOfString" />
            <s:element minOccurs="0" maxOccurs="1" name="Context" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Suffix" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfString">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="string" nillable="true" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="SendResponse">
        <s:complexType />
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="SendSoapIn">
    <wsdl:part name="parameters" element="tns:Send" />
  </wsdl:message>
  <wsdl:message name="SendSoapOut">
    <wsdl:part name="parameters" element="tns:SendResponse" />
  </wsdl:message>
  <wsdl:portType name="SendMessageSoap">
    <wsdl:operation name="Send">
      <wsdl:input message="tns:SendSoapIn" />
      <wsdl:output message="tns:SendSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="SendMessageSoap" type="tns:SendMessageSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="Send">
      <soap:operation soapAction="http://tempuri.org/Send" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="SendMessageSoap12" type="tns:SendMessageSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="Send">
      <soap12:operation soapAction="http://tempuri.org/Send" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="SendMessage">
    <wsdl:port name="SendMessageSoap" binding="tns:SendMessageSoap">
      <soap:address location="http://192.168.250.54:5901/SendMessage.asmx" />
    </wsdl:port>
    <wsdl:port name="SendMessageSoap12" binding="tns:SendMessageSoap12">
      <soap12:address location="http://192.168.250.54:5901/SendMessage.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>