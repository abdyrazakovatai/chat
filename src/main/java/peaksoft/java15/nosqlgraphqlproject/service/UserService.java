package peaksoft.java15.nosqlgraphqlproject.service;

import peaksoft.java15.nosqlgraphqlproject.dto.request.AuthRequest;
import peaksoft.java15.nosqlgraphqlproject.dto.response.AuthResponse;

public interface UserService {
    AuthResponse auth(AuthRequest authRequest);
}
