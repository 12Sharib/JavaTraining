package co.Assignment03.Answer3.Question01.Services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import co.Assignment03.Answer3.Question01.Model.Software;
import co.Assignment03.Answer3.Question03.Model.OutdatedLibrary;

public class SoftwareServices {
	private List<Software> Softwares = new ArrayList<>();
	public SoftwareServices(List<Software> softwares) {
		Softwares = softwares;
	}
	public Map<String, Set<Double>> SoftwareVersions() {

		System.out.println("**********************************");
		Map<String, Set<Double>> SoftwareVersions = Softwares.stream().collect(Collectors.groupingBy(Software::getOperatingSystem,
				Collectors.mapping(Software::getVersion, Collectors.toSet())));
		 return SoftwareVersions;
	}
	public void printResult(Map<String, Set<Double>> SoftwareVersions) {
		for (Entry<String, Set<Double>> values : SoftwareVersions.entrySet()) {
			Integer Count = values.getValue().size();
		
			if(Count>=2) {
				System.out.println(values.getKey());
			}
		}
		System.out.println("**********************************");
	}
}
