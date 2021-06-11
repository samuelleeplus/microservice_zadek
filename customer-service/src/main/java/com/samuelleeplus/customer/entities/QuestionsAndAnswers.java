package com.samuelleeplus.customer.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class QuestionsAndAnswers {

    private Question question ;
    private ArrayList<Answer> answers ;
}
