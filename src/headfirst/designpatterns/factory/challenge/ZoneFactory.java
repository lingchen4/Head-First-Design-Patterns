package headfirst.designpatterns.factory.challenge;

import java.util.Objects;

public class ZoneFactory {
	public Zone createZone(String zoneId) {
		Zone zone = null;
		if (Objects.equals(zoneId, "US/Pacific")) {
			zone = new ZonePacific();
		}
		else if (Objects.equals(zoneId, "US/Mountain")) {
			zone = new ZoneMountain();
		}
		else if (Objects.equals(zoneId, "US/Central")) {
			zone = new ZoneCentral();
		}
		else if (zoneId == "US/Eastern") {
			zone = new ZoneEastern();
		}
		return zone;
	}
}