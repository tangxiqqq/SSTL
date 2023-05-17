<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://tempuri.org/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/">
      <s:element name="ProjectStatusChange">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Password" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="ProjectId" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="ProjectCode" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="projectstatus" type="tns:PrjStatus" />
            <s:element minOccurs="0" maxOccurs="1" name="Describe" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:simpleType name="PrjStatus">
        <s:restriction base="s:string">
          <s:enumeration value="ABANDON" />
          <s:enumeration value="NEW" />
          <s:enumeration value="SUBMITED" />
          <s:enumeration value="CONFIRMED" />
          <s:enumeration value="CLOSE" />
          <s:enumeration value="CONFIRMED_TWO" />
          <s:enumeration value="ST_PROJ_CREATE" />
          <s:enumeration value="ST_PROJ_CHECK" />
          <s:enumeration value="ST_PROJ_ARRANGEMENT" />
          <s:enumeration value="ST_PROJ_OUTLINE" />
          <s:enumeration value="ST_PROJ_OUTLINECHECK" />
          <s:enumeration value="ST_PROJ_EXECUTE" />
          <s:enumeration value="ST_PROJ_REPORT" />
          <s:enumeration value="ST_PROJ_REPORTCHECK" />
          <s:enumeration value="ST_PROJ_REPORTAPP" />
          <s:enumeration value="ST_PROJ_REPORTPRINT" />
          <s:enumeration value="ST_PROJ_REPORTRELEASE" />
          <s:enumeration value="ST_PROJ_ARCHIVE" />
        </s:restriction>
      </s:simpleType>
      <s:element name="ProjectStatusChangeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="ProjectStatusChangeResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetProjectList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Password" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Mobile" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetProjectListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetProjectListResult" type="tns:ArrayOfProject" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfProject">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Project" nillable="true" type="tns:Project" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="Project">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ApplyVersion" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="IsGetFree" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="InvoiceState" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="GetReport" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="ID" nillable="true" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ProductCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="AcceptNumber" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="CustomerID" nillable="true" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="SoftwareName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SoftwareShortName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SoftwareEnglishName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Version" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Clients" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Developer" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="ExpValue" nillable="true" type="s:double" />
          <s:element minOccurs="0" maxOccurs="1" name="SourceIDs" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SourceOther" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SoftwareTypeIDs" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SoftwareTypeOther1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SoftwareTypeOther2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SoftwareTypeOther3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SoftwareTypeOther4" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Scale" nillable="true" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="DevelopTool" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Architecture" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ArchitectureOther" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ClientMarker" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ClientCPU" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ClientMemory" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ClientHardisk" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ClientOther" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ClientOP" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ClientBroswer" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ClientOtherSoftware" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ServerMarker" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ServerCPU" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ServerMemory" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ServerHardisk" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ServerOther" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ServerOP" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ServerDB" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ServerMiddleware" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ServerOtherSoftware" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Network" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EnviromentOther" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Description" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Features" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TestingTypeIDs" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TestingTypeOther1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TestingTypeOther2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SpecialRequirements" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SpecialRequirementsDT" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SpecialRequirementsOther" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="ApplyDT" nillable="true" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="ConfirmDT" nillable="true" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="Status" nillable="true" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="CompanyCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CompanyName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CompanyEnglishName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Address" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ZipCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Fax" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LinkMan" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LMCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LMPosition" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LMTel" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LMMobile" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LMEmail" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="URL" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ChargeMan" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CMCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CMMobile" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CMEmail" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CMTel" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CMPosition" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ConfirmMessage" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocsUserCount1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocsUser1Pages" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocsUserCount2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocsUser2Pages" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocsUserCount3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocsUser3Pages" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocsProDescCount" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocsProDescPages" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocsTechCount1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocsTech1Pages" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocsTechCount2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocsTech2Pages" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocsTestReqCount" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocsTestReqPages" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocsOther" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocsOtherCount" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocsOtherPages" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DiskCount" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DiskSpace" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DiskOther" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CompanyUscCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SoftwareCompanyName" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetStatusList">
        <s:complexType />
      </s:element>
      <s:element name="GetStatusListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetStatusListResult" type="tns:ArrayOfDictionaryEntry" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfDictionaryEntry">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="DictionaryEntry" type="tns:DictionaryEntry" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="DictionaryEntry">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Key" />
          <s:element minOccurs="0" maxOccurs="1" name="Value" />
        </s:sequence>
      </s:complexType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="ProjectStatusChangeSoapIn">
    <wsdl:part name="parameters" element="tns:ProjectStatusChange" />
  </wsdl:message>
  <wsdl:message name="ProjectStatusChangeSoapOut">
    <wsdl:part name="parameters" element="tns:ProjectStatusChangeResponse" />
  </wsdl:message>
  <wsdl:message name="GetProjectListSoapIn">
    <wsdl:part name="parameters" element="tns:GetProjectList" />
  </wsdl:message>
  <wsdl:message name="GetProjectListSoapOut">
    <wsdl:part name="parameters" element="tns:GetProjectListResponse" />
  </wsdl:message>
  <wsdl:message name="GetStatusListSoapIn">
    <wsdl:part name="parameters" element="tns:GetStatusList" />
  </wsdl:message>
  <wsdl:message name="GetStatusListSoapOut">
    <wsdl:part name="parameters" element="tns:GetStatusListResponse" />
  </wsdl:message>
  <wsdl:portType name="ProjectServicesSoap">
    <wsdl:operation name="ProjectStatusChange">
      <wsdl:input message="tns:ProjectStatusChangeSoapIn" />
      <wsdl:output message="tns:ProjectStatusChangeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetProjectList">
      <wsdl:input message="tns:GetProjectListSoapIn" />
      <wsdl:output message="tns:GetProjectListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetStatusList">
      <wsdl:input message="tns:GetStatusListSoapIn" />
      <wsdl:output message="tns:GetStatusListSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="ProjectServicesSoap" type="tns:ProjectServicesSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ProjectStatusChange">
      <soap:operation soapAction="http://tempuri.org/ProjectStatusChange" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetProjectList">
      <soap:operation soapAction="http://tempuri.org/GetProjectList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetStatusList">
      <soap:operation soapAction="http://tempuri.org/GetStatusList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="ProjectServicesSoap12" type="tns:ProjectServicesSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ProjectStatusChange">
      <soap12:operation soapAction="http://tempuri.org/ProjectStatusChange" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetProjectList">
      <soap12:operation soapAction="http://tempuri.org/GetProjectList" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetStatusList">
      <soap12:operation soapAction="http://tempuri.org/GetStatusList" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="ProjectServices">
    <wsdl:port name="ProjectServicesSoap" binding="tns:ProjectServicesSoap">
      <soap:address location="http://192.168.250.54:8088/webservices/projectservices.asmx" />
    </wsdl:port>
    <wsdl:port name="ProjectServicesSoap12" binding="tns:ProjectServicesSoap12">
      <soap12:address location="http://192.168.250.54:8088/webservices/projectservices.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>