package com.example.fonet.service;

import com.example.fonet.payload.request.AuthenticationRequest;
import com.example.fonet.payload.request.RegisterRequest;
import com.example.fonet.payload.response.AuthenticationResponse;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);
    AuthenticationResponse authenticate(AuthenticationRequest request);
}
