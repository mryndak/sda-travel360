package pl.sda.travel360.controller.response;

import lombok.Value;

@Value(staticConstructor = "of")
public class ErrorResponse {

    String path;
    String message;
    String code;
}
