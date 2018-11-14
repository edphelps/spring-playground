package com.myexample.mydemo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/myapp/formsubmit")
public class FormSubmit {

    @PostMapping("/individual-example")
    public String getIndividualParams(@RequestParam String content, @RequestParam String author) {
        return String.format("%s said %s!", author, content);
    }

    @PostMapping(value = "/map-example", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String getMapParams(@RequestParam Map<String, String> formData) {
        return formData.toString();
    }

    /* @PostMapping(value = "/object-example", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String getObjectParams(Search search) {
        return search.toString();
    } */

    @PostMapping("/string-example")
    public String getRawString(@RequestBody String rawBody) {
        return rawBody;
    }

}