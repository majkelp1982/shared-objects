package pl.smarthouse.sharedobjects.dto.zigbee;

public enum LightCommand {
  state, // OFF/ON/TOGGLE
  brightness, // 0-254
  color_temp, //   coolest, cool, neutral, warm, warmest 153-370
  color_xy, // x numeric, y numeric
  hue, // numeric
  saturation, // numeric
  effect // blink,breathe,okay,channel_change,finish_effect,stop_effect,colorloop,stop_colorloop
}
