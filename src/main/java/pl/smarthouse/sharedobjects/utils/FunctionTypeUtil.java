package pl.smarthouse.sharedobjects.utils;

import java.util.List;
import lombok.experimental.UtilityClass;
import pl.smarthouse.sharedobjects.dto.ventilation.enums.FunctionType;
import pl.smarthouse.sharedobjects.enums.ZoneName;

@UtilityClass
public class FunctionTypeUtil {
  public FunctionType determinateFunctionType(final ZoneName zoneName) {

    final List<ZoneName> airExtractZoneTypes =
        List.of(
            ZoneName.KUCHNIA,
            ZoneName.LAZ_DOL,
            ZoneName.PRALNIA,
            ZoneName.GARDEROBA,
            ZoneName.LAZ_GORA);
    final List<ZoneName> airSupplyZoneTypes =
        List.of(
            ZoneName.SALON,
            ZoneName.BIURO,
            ZoneName.PRZEDPOKOJ,
            ZoneName.WARSZTAT,
            ZoneName.RODZICE,
            ZoneName.NATALIA,
            ZoneName.KAROLINA);
    if (airExtractZoneTypes.contains(zoneName)) {
      return FunctionType.AIR_EXTRACT;
    }
    if (airSupplyZoneTypes.contains(zoneName)) {
      return FunctionType.AIR_SUPPLY;
    }

    throw new IllegalArgumentException(
        String.format(
            "Unable to determinate function type. Given zone name: %s, but expected: AIR_EXTRACT: %s, AIR_SUPPLY: %s",
            zoneName, airExtractZoneTypes, airSupplyZoneTypes));
  }
}
