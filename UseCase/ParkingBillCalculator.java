package com.rcm.req.crit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ParkingBillCalculator {

	public static String getDuration(String startTime, String endTime)
			throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		Date date1 = format.parse(startTime);
		Date date2 = format.parse(endTime);
		long millisecend = date2.getTime() - date1.getTime();
		return String.format(
				"%02d:%02d",
				TimeUnit.MILLISECONDS.toHours(millisecend),
				TimeUnit.MILLISECONDS.toMinutes(millisecend)
						- TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS
								.toHours(millisecend)));
	}

	public static int getCharge(String startTime, String endTime)
			throws ParseException {
		int totalCount = 60;
		int chargePerhr = 4;
		int minCharge = 2;
		int normal = 3;
		int sum = 0;
		String time = getDuration(startTime, endTime);
		int[] duration = { Integer.valueOf(time.split(":")[0]),
				Integer.valueOf(time.split(":")[1]) };
		List<Integer> amounts = new ArrayList<>();
		amounts.add(minCharge);
		if (duration[0] > 1 || duration[1] < totalCount) {
			amounts.add(normal);
		}
		amounts.add(duration[0] * chargePerhr);
		for (int rs : amounts) {
			sum += rs;
		}
		return sum;
	}

	public static void main(String[] args) throws ParseException {
		String time1 = "10:00";
		String time2 = "13:21";

		System.out.println("Total amount you have to pay : "
				+ getCharge(time1, time2));
	}

}
