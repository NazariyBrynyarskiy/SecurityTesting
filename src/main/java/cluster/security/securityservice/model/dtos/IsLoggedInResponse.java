package cluster.security.securityservice.model.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IsLoggedInResponse {

    private boolean isLoggedIn;
}
