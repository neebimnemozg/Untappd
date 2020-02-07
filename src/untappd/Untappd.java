/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package untappd;

import java.awt.AWTException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 *
 * @author ksmirnov
 */
public class Untappd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, AWTException {
        ArrayList<String> beers = new ArrayList<String>();

        beers.add("https://untappd.com/b/sun-inbev-russia-gripaedov/2755926");
        beers.add("https://untappd.com/b/sun-inbev-russia-dostoelskij/2790884");
        beers.add("https://untappd.com/b/sun-inbev-russia-sibirskaya-korona-lime-sibirskaya-korona-lajm/160787");
        beers.add("https://untappd.com/b/sun-inbev-russia-bud-alcohol-free-bezalkogolnoe/620168");
        beers.add("https://untappd.com/b/sun-inbev-russia-sibirskaya-korona-tri-hmelya-sibirskaya-korona-tri-hmelya/446703");
        beers.add("https://untappd.com/b/sun-inbev-russia-zhigulevskoe-originalnoe-zhigulevskoe-originalnoe/256054");
        beers.add("https://untappd.com/b/sun-inbev-russia-sibirskaya-korona-svetloe-sibirskaya-korona-svetloe/448293");
        beers.add("https://untappd.com/b/sun-inbev-russia-tolstyak-zhivoe-tolstyak-zhivoe/741766");
        beers.add("https://untappd.com/b/ochakovo-ochakovo-khalzan-halzan/1487906");
        beers.add("https://untappd.com/b/ochakovo-ochakovo-ochakovskiy-kvass/20871");
        beers.add("https://untappd.com/b/ochakovo-ochakovo-stolichnoe-dvoynoe-zolotoye-stolichnoe-dvojnoe-zolotoe/396954");
        beers.add("https://untappd.com/b/ochakovo-ochakovo-ochakovo-original-ochakovo-originalnoe/419251");
        beers.add("https://untappd.com/b/ochakovo-ochakovo-zhigulevskoe-zhigulevskoe/57681");
        beers.add("https://untappd.com/b/ochakovo-ochakovo-sekret-pivovara-sekret-pivovara/408983");
        beers.add("https://untappd.com/b/ochakovo-ochakovo-sekret-pivovara-troickoe-monastyrskoe/2583197");
        beers.add("https://untappd.com/b/ochakovo-ochakovo-yachmenny-kolos-yachmennyj-kolos/187443");
        beers.add("https://untappd.com/b/ochakovo-ochakovo-zlatovice/2135266");
        beers.add("https://untappd.com/b/ochakovo-ochakovo-pugach/2637724");
        beers.add("https://untappd.com/b/belyj-kreml-bely-kreml-belyj-kreml-beloe-bely-kreml-beloe/2888762");
        beers.add("https://untappd.com/b/belyj-kreml-bely-kreml-belyj-kreml-klassicheskoe-bely-kreml-klassicheskoe/2804034");
        beers.add("https://untappd.com/b/belyj-kreml-bely-kreml-cz-svetle/2806315");
        beers.add("https://untappd.com/b/heineken-brewery-obedinennye-pivovarni-hejneken-amstel-ipa/2659638");
        beers.add("https://untappd.com/b/heineken-brewery-obedinennye-pivovarni-hejneken-okhota-krepkoe-ohota-krepkoe/443584");
        beers.add("https://untappd.com/b/heineken-brewery-obedinennye-pivovarni-hejneken-tri-medvedya-svetloe-tri-medvedya-svetloe/305754");
        beers.add("https://untappd.com/b/heineken-brewery-obedinennye-pivovarni-hejneken-stepan-razin-petrovskoe-stepan-razin-petrovskoe/36271");
        beers.add("https://untappd.com/b/heineken-brewery-obedinennye-pivovarni-hejneken-mister-lis/2604390");
        beers.add("https://untappd.com/b/brauerei-goss-gosser-naturzitrone-0-0/415190");
        beers.add("https://untappd.com/b/heineken-brewery-obedinennye-pivovarni-hejneken-okskoe-bochkovoe-okskoe-bochkovoe/190206");
        beers.add("https://untappd.com/b/moscow-efes-brewery-pivovarnya-moskva-efes-stary-melnik-iz-bochonka-myagkoe-staryj-melnik-iz-bochonka-myagkoe/316140");
        beers.add("https://untappd.com/b/moscow-efes-brewery-pivovarnya-moskva-efes-stary-melnik-svetloe-staryj-melnik-svetloe/20107");
        beers.add("https://untappd.com/b/moscow-efes-brewery-pivovarnya-moskva-efes-387/679725");
        beers.add("https://untappd.com/b/moscow-efes-brewery-pivovarnya-moskva-efes-bely-medved-svetloe-belyj-medved-svetloe/591148");
        beers.add("https://untappd.com/b/moscow-efes-brewery-pivovarnya-moskva-efes-stary-melnik-iz-bochonka-svetloe-staryj-melnik-iz-bochonka-svetloe/200698");
        beers.add("https://untappd.com/b/moscow-efes-brewery-pivovarnya-moskva-efes-zolotaya-bochka-klassicheskoe-zolotaya-bochka-klassicheskoe/26192");
        beers.add("https://untappd.com/b/sabmiller-rus-amber-weiss/193738");
        beers.add("https://untappd.com/b/moscow-efes-brewery-pivovarnya-moskva-efes-kozel-bohaty-chmel/2005976");
        beers.add("https://untappd.com/b/moscow-efes-brewery-pivovarnya-moskva-efes-stary-melnik-iz-bochonka-barhatnoe-staryj-melnik-iz-bochonka-barhatnoe/165225");
        beers.add("https://untappd.com/b/moscow-efes-brewery-pivovarnya-moskva-efes-zolotaya-bochka-svetloe-zolotaya-bochka-svetloe/26202");
        beers.add("https://untappd.com/b/moscow-efes-brewery-pivovarnya-moskva-efes-tverdyj-znak/2107738");
        beers.add("https://untappd.com/b/moscow-efes-brewery-pivovarnya-moskva-efes-essa/327424");
        beers.add("https://untappd.com/b/moscow-efes-brewery-pivovarnya-moskva-efes-john-copper/2646610");
        beers.add("https://untappd.com/b/moscow-efes-brewery-pivovarnya-moskva-efes-zhigulevskoe-bochkovoe-zhigulevskoe-bochkovoe/443195");
        beers.add("https://untappd.com/b/moscow-efes-brewery-pivovarnya-moskva-efes-bely-medved-krepkoe-belyj-medved-krepkoe/382089");
        beers.add("https://untappd.com/b/sabmiller-rus-moya-kaluga-zhivoe-moya-kaluga-zhivoe/404726");
        beers.add("https://untappd.com/b/moscow-efes-brewery-pivovarnya-moskva-efes-essa-lime-and-mint/1922164");
        beers.add("https://untappd.com/b/moscow-efes-brewery-pivovarnya-moskva-efes-gold-mine-beer/201806");
        beers.add("https://untappd.com/b/sabmiller-rus-zwei-meister/53459");
        beers.add("https://untappd.com/b/moscow-efes-brewery-pivovarnya-moskva-efes-zolotaya-bochka-shabolovskoe/1118901");
        beers.add("https://untappd.com/b/moscow-efes-brewery-pivovarnya-moskva-efes-redd-s/793730");
        beers.add("https://untappd.com/b/moscow-efes-brewery-pivovarnya-moskva-efes-zolotaya-bochka-vyderzhannoe-zolotaya-bochka-vyderzhannoe/192090");
        beers.add("https://untappd.com/b/moscow-efes-brewery-pivovarnya-moskva-efes-stary-melnik-iz-bochonka-temnoye-staryj-melnik-iz-bochonka-temnoe/430618");
        beers.add("https://untappd.com/b/wolf-s-brewery-volkovskaya-pivovarnya-blansh-de-mazaj-blanche-de-mazay/1594400");
        beers.add("https://untappd.com/b/wolf-s-brewery-volkovskaya-pivovarnya-svetlyachok/2050631");
        beers.add("https://untappd.com/b/wolf-s-brewery-volkovskaya-pivovarnya-ipa-v-3/1941326");
        beers.add("https://untappd.com/b/wolf-s-brewery-volkovskaya-pivovarnya-port-artur/1299790");
        beers.add("https://untappd.com/b/wolf-s-brewery-volkovskaya-pivovarnya-apa-azacca-and-pekko/1811523");
        beers.add("https://untappd.com/b/wolf-s-brewery-volkovskaya-pivovarnya-nepravilnyj-myod/1561153");
        beers.add("https://untappd.com/b/wolf-s-brewery-volkovskaya-pivovarnya-mishenka-pod-vishenkoj/2061903");
        beers.add("https://untappd.com/b/wolf-s-brewery-volkovskaya-pivovarnya-nitro-ipa/2810690");
        beers.add("https://untappd.com/b/wolf-s-brewery-volkovskaya-pivovarnya-apa-vic-secret-and-galaxy/1707304");
        beers.add("https://untappd.com/b/wolf-s-brewery-volkovskaya-pivovarnya-volchok/3406410");
        beers.add("https://untappd.com/b/wolf-s-brewery-volkovskaya-pivovarnya-sidrova-koza/3267685");
        beers.add("https://untappd.com/b/wolf-s-brewery-volkovskaya-pivovarnya-alabama/2575194");
        beers.add("https://untappd.com/b/wolf-s-brewery-volkovskaya-pivovarnya-apa-el-dorado-and-centennial/3099438");
        beers.add("https://untappd.com/b/wolf-s-brewery-volkovskaya-pivovarnya-neipazza/2211024");
        beers.add("https://untappd.com/b/wolf-s-brewery-volkovskaya-pivovarnya-100-rentgen/2168490");
        beers.add("https://untappd.com/b/wolf-s-brewery-volkovskaya-pivovarnya-latte-de-lupo/2814685");
        beers.add("https://untappd.com/b/wolf-s-brewery-volkovskaya-pivovarnya-back-n-black/3048120");
        beers.add("https://untappd.com/b/wolf-s-brewery-volkovskaya-pivovarnya-nomikai-blonde/2617815");

        ArrayList<String> host = new ArrayList<String>();
        ArrayList<String> port = new ArrayList<String>();

        System.setProperty("webdriver.chrome.driver", /*System.getProperty("user.dir")*/ "D://chromedriver.exe");

        /*ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addExtensions(new File("D://extension_2_6_3_0.crx"));
        ChromeDriver driver1 = new ChromeDriver(chromeOptions);
        
        driver1.manage().window().maximize();
        JavascriptExecutor jsx = (JavascriptExecutor) driver1;
        driver1.get("http://free-proxy.cz/");
        jsx.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(5000);

        for (int i = 2; i <= 4; i++) {
            List<WebElement> list3 = driver1.findElements(By.className("fport"));
            for (WebElement e : list3) {
                port.add(e.getText());
            }
            List<WebElement> list2 = driver1.findElements(By.className("left"));
            for (WebElement e : list2) {
                if (e.getText().contains(".")) {
                    host.add(e.getText());
                }
            }
            WebElement element = driver1.findElement(By.xpath("//a[text()='" + i + "']"));
            Thread.sleep(100);
            element.click();
            Thread.sleep(400);
            System.out.println(port.size());
            System.out.println(host.size());

        }

        for (int i = 0; i < 10; i++) {

        }*/

        ChromeOptions chromeOptions1 = new ChromeOptions();

        /*Proxy proxy = new Proxy();

        char dm = (char) 34;
        String string = dm + host.get(0) + ":" + port.get(0) + dm;

        proxy.setProxyType(Proxy.ProxyType.MANUAL);
        proxy.setHttpProxy(string);
        proxy.setAutodetect(false);
        proxy.setFtpProxy(string);
        proxy.setSslProxy(string);
        proxy.setNoProxy("no_proxy-var");
        proxy.setAutodetect(false);

        chromeOptions.setCapability(CapabilityType.PROXY, proxy);*/
        
        chromeOptions1.addExtensions(new File("D://extension_2_6_3_0.crx"));
        
        ChromeDriver driver = new ChromeDriver(chromeOptions1);

        driver.manage().window().maximize();

        driver.get("https://untappd.com/login");
        Thread.sleep(20000);
        JavascriptExecutor jsx = (JavascriptExecutor) driver;

        /*Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        jsx.executeScript("window.scrollTo(0, 100000)");
        Thread.sleep(1000);

        WebElement element1 = driver.findElement(By.xpath("//a[text()='Show More']"));
        element1.click();
        Thread.sleep(20000);*/
        for (int i = 0; i < beers.size(); i++) {
            driver.get(beers.get(i));
            Thread.sleep(1000);

            for (int j = 0; j < 11; j++) {
                jsx.executeScript("window.scrollTo(0, 100000000000000000000000000000000000000000)");
                Thread.sleep(1000);

                if (driver.findElement(By.xpath("//a[text()='Show More']")).isEnabled()) {
                    List<WebElement> elementz = driver.findElements(By.xpath("//a[text()='Show More']"));
                    System.out.println(elementz.size());
                    if (elementz.size() == 2) {
                        elementz.get(1).click();
                        Thread.sleep(4000);
                    } else {
                        elementz.get(0).click();
                        Thread.sleep(4000);
                    }
                }
            }

            List<WebElement> users = driver.findElements(By.className("user"));
            for (WebElement ele : users) {
                System.out.println(ele.getAttribute("href"));
            }
            List<WebElement> time = driver.findElements(By.className("bottom"));
            for (WebElement ele : time) {
                if (ele.getText().contains("View Detailed")) {
                    System.out.println(ele.getText());
                }
            }
            /*List<WebElement> mark = driver.findElements(By.className("caps"));
            for (WebElement ele : mark) {
                System.out.println(ele.getAttribute("data-rating"));
            }*/

     /*List<WebElement> list = driver.findElements(By.xpath("//*[@href]"));
            for (WebElement e : list) {
                System.out.println(e.getText());
            }*/

 /*while (driver.findElements(By.className("more_checkins button yellow track-click more_checkins_logged")).size() > 0) {
                Thread.sleep(1000);
                WebElement element1 = driver.findElement(By.className("more_checkins button yellow track-click more_checkins_logged"));
                element1.click();
                System.out.println("click");
            }*/
            //System.out.println(info);
        }
        driver.quit();
        //driver1.quit();
    }

}
