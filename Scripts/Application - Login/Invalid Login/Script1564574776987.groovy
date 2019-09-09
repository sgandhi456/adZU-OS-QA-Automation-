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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bt.adzu4-staging.codeworldwide.com/#')

WebUI.delay(10)

WebUI.setText(findTestObject('Login/login_username'), 'satinder.gand')

WebUI.delay(2)

WebUI.setText(findTestObject('Login/login_password'), 'ADZU#os123')

WebUI.delay(1)

WebUI.click(findTestObject('Login/LoginButton_STA'))

WebUI.waitForElementPresent(findTestObject('Login/InvalidLogin_Validation2'), 1)

String result = WebUI.getText(findTestObject('Login/InvalidLogin_Validation2'))

//WebUI.verifyElementText(findTestObject('Login/InvalidLogin_Validation'), 'Invalid username or password')
String exp_result = 'Invalid username or password'

if (result.contains(exp_result)) {
    KeywordLogger log = new KeywordLogger()

    log.logInfo(result, null)
	

    KeywordUtil.markPassed(exp_result)
	return null
} else {
    WebUI.comment(result)

    KeywordUtil.markFailedAndStop('failed')
	
}

