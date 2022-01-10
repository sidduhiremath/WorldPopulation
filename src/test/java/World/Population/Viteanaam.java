package World.Population;

public class Viteanaam {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\chrome\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://worldometers.info/world-population/");
		System.out.println(d.findElement(By.xpath("//span[@rel='viet-nam-population']")).getText());
		d.close();

	}

}
