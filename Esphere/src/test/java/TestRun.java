import core.BaseData;
import helperClass.Listener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.InformatorSphereRuPage;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;

@Listeners(Listener.class)

/**
 * Created by User on 16.03.17.
 */
public class TestRun extends BaseData {

    @Test       @TestCaseId("Id-0001")
    @Stories("Поиск по: Названию, ФИО, ИНН, ОГРН. (за валидный поиск берётся текущий вывод вашего поискового запроса)")
    public void searchByNameSurnameTaxpayerMainstateregnumber(){
        InformatorSphereRuPage.clickFieldSearch();
        InformatorSphereRuPage.typeNameSurnamePatronymic();
        InformatorSphereRuPage.clickButtonSearch();
        InformatorSphereRuPage.checkAppearanceOfAtLeastOne();
        Assert.assertTrue(InformatorSphereRuPage.checkResultOfSearchByNameSurnamePatronymic());
        InformatorSphereRuPage.clickFieldSearch();
        InformatorSphereRuPage.typeNameOfOrganization();
        InformatorSphereRuPage.clickButtonSearch();
        InformatorSphereRuPage.checkAppearanceOfAtLeastOne();
        Assert.assertTrue(InformatorSphereRuPage.checkResultOfSearchByNameOfOrganization());
        InformatorSphereRuPage.clickFieldSearch();
        InformatorSphereRuPage.typeTaxpayerIdentificationNumber();
        InformatorSphereRuPage.clickButtonSearch();
        InformatorSphereRuPage.checkAppearanceOfAtLeastOne();
        Assert.assertTrue(InformatorSphereRuPage.checkResultOfSearchByTaxpayerIdentificationNumber());
        InformatorSphereRuPage.clickFieldSearch();
        InformatorSphereRuPage.typeMainStateRegisterNumber();
        InformatorSphereRuPage.clickButtonSearch();
        InformatorSphereRuPage.checkAppearanceOfAtLeastOne();
        Assert.assertTrue(InformatorSphereRuPage.checkResultOfSearchByMainStateRegisterNumberNumber());
        System.out.println(" >>>>> Первый тест прошёл успешно! ");
    }

    @Test       @TestCaseId("Id-0002")
    @Stories("При наведении  мыши на поле ввода выводится соответствующая всплывающая подсказка")
    public void checkTooltipWhenHoverTheMouseOnTheInputSearchField() throws InterruptedException{
        InformatorSphereRuPage.hoverMouseOnTheInputSearchField();
        Assert.assertTrue(InformatorSphereRuPage.checkTooltipAppeareance());
        System.out.println(" >>>>> Второй тест прошёл успешно! ");
    }

    @Test       @TestCaseId("Id-0003")
    @Stories("После нажатия на «Сфера Информатор» отображается пустая область результатов")
    public void checkEmptyAreaIsDisplayedAfterClickingSphereInformator() throws InterruptedException{
        InformatorSphereRuPage.clickFieldSearch();
        InformatorSphereRuPage.typeNameSurnamePatronymic();
        InformatorSphereRuPage.clickButtonSearch();
        InformatorSphereRuPage.clickOnTheButtonSphereInfo();
        Assert.assertFalse(InformatorSphereRuPage.checkResultOfSearchByNameSurnamePatronymic());
        System.out.println(" >>>>> Третий тест прошёл успешно! ");
        //dscdscdscsd
    }
}
