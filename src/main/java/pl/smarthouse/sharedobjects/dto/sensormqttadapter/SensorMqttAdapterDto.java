package pl.smarthouse.sharedobjects.dto.sensormqttadapter;

import lombok.Data;
import pl.smarthouse.sharedobjects.dto.zigbee.Snzb03;

@Data
public class SensorMqttAdapterDto {
  Snzb03 movementSensorsLazDol;
  Snzb03 movementSensorsLazGora;
}
