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

WebUI.click(findTestObject('Material/Add Material/Button_Add_Material'))

WebUI.waitForPageLoad(1)

WebUI.setText(findTestObject('Material/Add Material/Text_UniqueName'), 'Material_Test')

WebUI.waitForElementPresent(findTestObject('Material/Add Material/dd_MediaChannel_Text'), 1)

WebUI.click(findTestObject('Material/Add Material/dd_MediaChannel_Text'))

WebUI.delay(1)

WebUI.click(findTestObject('Material/Add Material/div_Online'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Material/Add Material/Thumbnail Image'), 0)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('Material/Add Material/Thumbnail Image'), 'C:\\Adzu\\ab.jpg')

WebUI.delay(3)

WebUI.click(findTestObject('Material/Add Material/Button_AddExistingTemplate'))

WebUI.delay(2)

WebUI.setText(findTestObject('Material/Add Material/Text_SearchTemplate'), 'Retina_Test')

WebUI.delay(1)

WebUI.click(findTestObject('Material/Add Material/Grid_TemplateRow'))

WebUI.delay(1)

WebUI.click(findTestObject('Material/Add Material/Button_SaveTemplate'))

WebUI.delay(1)

WebUI.click(findTestObject('Material/Add Material/Button_SaveMaterial'))

WebUI.delay(1)

