package com.hrank.regex.application.medium;

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class DetectEmailAddressTest {

    @Test
    void detect() {
        DetectEmailAddress tester = new DetectEmailAddress();
        String lines = "HackerRank is more than just a company\n" +
                "    We are a tight group of hackers, bootstrappers, entrepreneurial thinkers and innovators. We are building an engaged community of problem solvers. Imagine the intelligence and value that a room would hold if it contained hackers/problem solvers from around the world? We're building this online.\n" +
                "Hypothesis: Every hacker loves a particular type of challenge presented in a certain set of difficulty. If we build a large collection of real world challenges in different domains with an engaging interface, it is going to be incredible! Join us to create history.\n" +
                "Available Positions\n" +
                "Product Hacker product@hackerrank.com\n" +
                "Challenge Curator\n" +
                "Product Evangelist\n" +
                "Product Designer\n" +
                "Content Creator\n" +
                "ACM World Finals Hacker\n" +
                "Backend C++ Hacker\n" +
                "Mail us at hackers@hackerrank.com to chat more. Or you can write to us at interviewstreet@hackerrank.com!\n" +
                "HACKERRANK PERKS\n" +
                "Working for a startup is hard work, but there are plenty of benefits of working for a small, fun, growing team.\n" +
                "[Image] Perk: Get tools for the jobAll the Right ToolsWe know that everyone's perfect workspace is unique to them. We will get you set up with whatever equipment you need to start hacking - a new 15” Macbook Pro or iMac, or a computer of your choice plus a display if you need it. Additionally, if you require any software or other tools, we've got it covered.[Image] Perk: Flexible HoursFlexible HoursBecause we work so hard, we encourage our employees to keep flexible hours and don't require them to track their time. A morning scrum and open communication ensures that the job gets done on time, and we rely on the honor system so that you can work on your own pace.[Image] Perk: HealthcareWellness SupportTo work hard, you have to be healthy. We will cover your health, dental, and visual insurance with no wait period. That means instant benefits from the day you're hired.[Image] Perk: Choice of LocationLocation, Location, LocationWe are the first Indian company to be backed by Y-Combinator, and as a result we have a thriving office in Bangalore and a growing office in Mountain View, CA. Depending on your residency or visa status, we will get you situated in one of our two offices, both of which are located in the heart of their country's tech industry.[Image] Perk: Choice of LocationCreative SupportIf you have a cool side project that you want to launch, we will pay for EC2/heroku servers to get it off the ground. Side projects fuel creativity and learning, which are crucial to the HackerRank culture.\n" +
                "CULTURE\n" +
                "The culture of a startup is reflective of the founders’ DNA. Larry Page & Sergey Brin were PhD’s from Stanford and that’s why Google is filled with high scoring graders from top schools and is very hard to get in if you’re not a CS major. Similarly, the hacker culture at Facebook is inspired by Zuckerberg, a hacker, the design culture by Steve Jobs and so on.\n" +
                "The adjective to describe the environment/founders here is relentless hardworkers. It might be a general trait of a startup but I’m pretty sure it’s a notch higher here and defines the culture. This is what has taken us this far. It’s not working in weekends or allnighters that count, but the effort that goes into building something intellectually engaging for hackers and making it fun is high.\n" +
                "You’ll have to embrace randomness and chaos. There’s some level of discipline (eg: daily scrums) but only so much. We push boundaries everyday, stretch our limits but no one complains because there’s a feeling of doing something great at the end of the day, every single day.";
        Set<String> emailIds = tester.detect(lines);
        Set<String> expected = new TreeSet<>(
                Set.of("hackers@hackerrank.com","interviewstreet@hackerrank.com","product@hackerrank.com"));
        assertIterableEquals(expected, emailIds);
    }
}