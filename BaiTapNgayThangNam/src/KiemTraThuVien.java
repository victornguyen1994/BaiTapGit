import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

import sun.java2d.pipe.SpanShapeRenderer.Simple;

public class KiemTraThuVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date  = new Date(System.currentTimeMillis());
		Calendar ca =Calendar.getInstance();
		//System.out.println(date.toString());
		System.out.println(Calendar.DAY_OF_MONTH +"/"+( ca.get(ca.MONTH)+1) +"/"+ca.get(ca.YEAR));
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df.format(date));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
	}

}
