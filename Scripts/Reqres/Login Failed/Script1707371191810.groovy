import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

RequestObject verifyBasic = findTestObject('Object Repository/Login_Reqres')
verifyBasic.setRestUrl("https://reqres.in/api/login")

ArrayList<TestObjectProperty> HTTPHeader = new ArrayList<TestObjectProperty>()
HTTPHeader.add(new TestObjectProperty('Content-Type', ConditionType.EQUALS, 'application/json'))
verifyBasic.setHttpHeaderProperties(HTTPHeader)

WS.comment('Login Success')

String requestBody = """{
    "email": "eve.holt@reqres.in"
}"""
verifyBasic.setBodyContent(new HttpTextBodyContent(requestBody))

'send request'
def responseVerifyBasic = WS.sendRequest(verifyBasic)

'Verify Respon'
def hasil = WS.verifyResponseStatusCode(responseVerifyBasic, 400)