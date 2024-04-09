package com.noufal.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pacman")
public class Pacman implements GamingConsole{

        public void up() {
            System.out.println("Jump ...");
        }

        public void down() {
            System.out.println("Go into a hole ...");
        }

        public void left() {
            System.out.println("Go left ...");
        }

        public void right() {
            System.out.println("Go Fast ...");
        }
}
