package mp.hbsapi.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    @JsonProperty("employee_id")
    private String employeeId;
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
}
