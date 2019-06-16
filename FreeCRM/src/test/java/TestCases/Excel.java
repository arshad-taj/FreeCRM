package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.utils.ExcelReader;

public class Excel {
	
	ExcelReader reader;
	
	@Test
	public void readXLxs() throws IOException
	{
		reader=new ExcelReader();
		reader.selectDaptName("Computer");
	}

}
