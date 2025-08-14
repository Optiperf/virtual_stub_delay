package com.virtual.stub;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping("/mock")
public class MockController {

    @Value("${INSTANCE_ID:unknown}")
    private String instanceId;

    @GetMapping("/{delay}")
    public MockResponse getMock(@PathVariable int delay) throws InterruptedException {
        Thread.sleep(delay);
        return new MockResponse(instanceId, delay + " ms");
    }

    static class MockResponse {
        private String location;
        private String delay;

        public MockResponse(String location, String delay) {
            this.location = location;
            this.delay = delay;
        }

        public String getLocation() {
            return location;
        }

        public String getDelay() {
            return delay;
        }
    }
}
