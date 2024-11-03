package pl.smarthouse.sharedobjects.dto;

import lombok.Data;

@Data
public class ApplicationSettingsDto {
  private String type;
  private String serviceVersion;
  private String serviceAddress;
}
