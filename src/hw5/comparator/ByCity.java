package hw5.comparator;

import java.util.Comparator;

import hw5.IPAddress;

//Comparator implementation that compares IP Addresses by city name
public class ByCity implements Comparator<IPAddress>{

	@Override
	public int compare(IPAddress o1, IPAddress o2) {
		return o1.getCityName().compareTo(o2.getCityName());
	}

}
