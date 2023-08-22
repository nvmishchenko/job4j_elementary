package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DummyBotTest {

    @Test
    void whenGreetBot() {
        String in = "Hi, Bot.";
        String result = DummyBot.answer(in);
        String expected = "Hi, SmartAss.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenByeBot() {
        String in = "Bye.";
        String expected = "See you later.";
        String result = DummyBot.answer(in);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenUnknownBot() {
        String in = "Can you add two plus two?";
        String expected = "I don't know. Please, ask another question.";
        String result = DummyBot.answer(in);
        assertThat(result).isEqualTo(expected);
    }
}