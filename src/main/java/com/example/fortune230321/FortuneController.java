package com.example.fortune230321;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FortuneController {

    @GetMapping("/fortune")
    public ObjectNode getFortune() {
        String[] fortunes = {
                "오늘은 좋은 일이 생길 것 같아요.",
                "잠시 기운을 차리세요. 기운을 차린 후에 다시 시작해 보세요.",
                "긍정적인 마음가짐으로 모든 일을 해결하세요.",
                "좋은 인연을 만날 수 있는 날입니다.",
                "오늘은 적극적으로 행동해야 할 것 같습니다."
        };

        int randomIndex = (int) (Math.random() * fortunes.length);

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode response = mapper.createObjectNode();
        response.put("fortune", fortunes[randomIndex]);

        return response;
    }
}
