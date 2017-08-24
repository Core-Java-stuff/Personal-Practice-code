package com.rcm.req.crit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author basanta.kumar.hota
 * 
 *         Requirement:
 * 
 *         assume i have working Time slot of a day like [All Day,7-8 AM,8-10
 *         AM,10-12 PM,1-3 PM,3-5 PM,5-7 PM,7-9 PM]
 * 
 *         Suppose a user will work from morning 11 am to evening 6pm means it
 *         should display the all slot comes under 11AM-6PM i.e [10-12 PM,1-3
 *         PM,3-5 PM,5-7 PM]
 *
 */
public class TimeSlotExtractor {

	private static String[] timeSlots = { "All Day", "7-8 AM", "8-10 AM",
			"10-12 PM", "1-3 PM", "3-5 PM", "5-7 PM", "7-9 PM" };

	// 11 //6
	public static List<String> getSlots(String startTime, String endTime) {
		int st = Integer.valueOf(startTime);
		int et = Integer.valueOf(endTime);
		List<String> slots = new ArrayList<>();
		// if duration is 2 HR
		if (et - st <= 1) {
			for (String slot : timeSlots) {
				if (slot.startsWith(String.valueOf(st))) {
					slots.add(slot);
				} else {
					if (slot.startsWith(String.valueOf(st - 1))) {
						slots.add(slot);
					}
				}
			}
		} // if work is 12 HR
		else if (et - st == 0) {
			slots.add("ALL-DAY");
		} else {
			for (int i = 1; i <= timeSlots.length - 1; i++) {
				Integer[] formatSlot = splitSlot(timeSlots[i]);
				if (st >= formatSlot[0] && st <= formatSlot[1]
						|| st <= formatSlot[0] && st <= formatSlot[1]) {
					// 9-12 //10-12
					if (et >= formatSlot[0] || et <= formatSlot[1]) {
						slots.add(timeSlots[i]);
					}
				}
			}
		}
		return slots;
	}

	public static void main(String[] args) {
		System.out.println(getSlots("4", "7"));

	}

	private static Integer[] splitSlot(String slot) {
		Integer[] slots = { Integer.valueOf(slot.split("-")[0]),
				Integer.valueOf(slot.split("-")[1].split(" ")[0]) };
		return slots;
	}

}
