package pl.smarthouse.sharedobjects.dto.ventilation;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.smarthouse.sharedobjects.dto.ventilation.core.AirExchangerDto;
import pl.smarthouse.sharedobjects.dto.ventilation.core.FansDto;
import pl.smarthouse.sharedobjects.dto.ventilation.core.ForcedAirSystemExchangerDto;
import pl.smarthouse.sharedobjects.dto.ventilation.core.IntakeThrottleDto;
import pl.smarthouse.sharedobjects.dto.ventilation.enums.State;
import pl.smarthouse.sharedobjects.enums.ZoneName;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({
  "fans",
  "circuitPump",
  "airCondition",
  "intakeThrottle",
  "airExchanger",
  "forcedAirSystemExchanger",
  "zoneDaoHashMap"
})
public class VentModuleDto {
  private HashMap<ZoneName, ZoneDto> zoneDtoHashMap;
  private FansDto fans;
  private IntakeThrottleDto intakeThrottle;
  private AirExchangerDto airExchanger;
  private ForcedAirSystemExchangerDto forcedAirSystemExchanger;
  private State circuitPump;
  private State airCondition;
}
