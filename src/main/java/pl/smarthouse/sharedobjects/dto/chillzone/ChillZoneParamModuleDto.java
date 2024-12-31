package pl.smarthouse.sharedobjects.dto.chillzone;

import lombok.Data;

@Data
public class ChillZoneParamModuleDto {
  private SpaDeviceParam sauna;
  private SpaDeviceParam chillRoom;
}
