package pl.smarthouse.sharedobjects.dto.chillzone;

import lombok.Data;

@Data
public class ChillZoneParamModuleDto {
  private final SpaDeviceParam sauna;
  private final SpaDeviceParam chillRoom;
}
