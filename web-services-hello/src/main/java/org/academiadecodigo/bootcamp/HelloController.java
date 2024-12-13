package org.academiadecodigo.bootcamp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public ResponseEntity<String>
    helloWorld(@RequestParam(value = "name", defaultValue = "World") String str) {

        return new ResponseEntity<String>("Hello " + str, HttpStatus.OK);
    }

}


