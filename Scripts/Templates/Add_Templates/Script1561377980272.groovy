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

WebUI.delay(1)

WebUI.click(findTestObject('Templates/Add_Templates/Button_AddTemplate'))

WebUI.delay(1)

WebUI.setText(findTestObject('Templates/Add_Templates/Template_Name'), 'Retina_Test')

WebUI.delay(1)

WebUI.click(findTestObject('Templates/Add_Templates/Page_Templates  BaseTenants/Template Renderer_Arrow'))

WebUI.delay(1)

WebUI.click(findTestObject('Templates/Add_Templates/div_HTMLRenderingservice'))

WebUI.delay(1)

WebUI.click(findTestObject('Templates/Add_Templates/Page_Templates  BaseTenants/TemplateType_dd'))

WebUI.delay(1)

WebUI.click(findTestObject('Templates/Add_Templates/Page_Templates  BaseTenants/Page_Templates  BaseTenants/div_Template'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('Templates/Add_Templates/Upload_Package'), 'C:\\Adzu\\Template\\Retina display 4.zip')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Templates/Add_Templates/Page_Templates  BaseTenants/TemplateVariable_dd'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Templates/Add_Templates/Page_Templates  BaseTenants/TemplateVariable_dd'))

WebUI.delay(1)

WebUI.setText(findTestObject('Templates/Add_Templates/Page_Templates  BaseTenants/input_TemplateVariable'), 'Test123')

WebUI.delay(1)

WebUI.click(findTestObject('Templates/Add_Templates/Page_Templates  BaseTenants/div_Test123'))

WebUI.delay(1)

WebUI.click(findTestObject('Templates/Add_Templates/Button_Save'))

WebUI.delay(1)

