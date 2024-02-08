import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('www.facebook.com')

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.comment('Negative')

WebUI.verifyElementPresent(findTestObject('Facebook/Text Field - Username'), 0)

WebUI.verifyElementPresent(findTestObject('Facebook/Text Field - Password'), 0)

WebUI.verifyElementPresent(findTestObject('Facebook/Button_Masuk'), 0)

WebUI.click(findTestObject('Facebook/Button_Masuk'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Facebook/Error_Message(Login)'), 0)

WebUI.comment('Positive')

WebUI.verifyElementPresent(findTestObject('Facebook/Text Field - Username'), 0)

WebUI.setText(findTestObject('Facebook/Text Field - Username'), 'testakvnonline@gmail.com')

WebUI.verifyElementPresent(findTestObject('Facebook/Text Field - Password'), 0)

WebUI.setText(findTestObject('Facebook/Text Field - Password'), 'testonline_123')

WebUI.verifyElementPresent(findTestObject('Facebook/Button_Login'), 0)

WebUI.click(findTestObject('Facebook/Button_Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

