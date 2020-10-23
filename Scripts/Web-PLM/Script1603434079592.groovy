import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dertlbplmdev.intra.local.s.oliver.de/3dpassport//login?service=https%3A%2F%2Fdertlbplmdev.intra.local.s.oliver.de%2FsOliverPLM%2F')

WebUI.setText(findTestObject('Object Repository/Page_3DPassport - Login/input_Username or email_username'), 'PLMADM')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_3DPassport - Login/input_Password_password'), 'KciG4Ru89SCpg6fWp3p25A==')

WebUI.click(findTestObject('Object Repository/Page_3DPassport - Login/input_Remember me_uwa-submit uwa-submit-roo_363c64'))

WebUI.verifyElementPresent(findTestObject('Page_3DEXPERIENCE Platform/span_PLM ADM'), 0)

