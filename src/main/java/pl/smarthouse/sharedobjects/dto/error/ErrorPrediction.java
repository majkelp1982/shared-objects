package pl.smarthouse.sharedobjects.dto.error;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Predicate;
import lombok.*;
import pl.smarthouse.sharedobjects.dao.ModuleDao;

@Getter
@Setter
@EqualsAndHashCode
@RequiredArgsConstructor
public class ErrorPrediction implements Cloneable {
  @NonNull private final String message;
  private final int priority;
  @NonNull private final Predicate<? extends ModuleDao> predicate;
  private final Consumer<Boolean> stateChangedListener;
  private boolean enable;
  private LocalDateTime beginTimestamp;
  private LocalDateTime endTimestamp;
  private boolean active;
  private boolean pendingAcknowledge;

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
