package sn.odc.oumar.entities;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class User {
    private int id;
    private String nom;
    private String prenom;
    private String login;
    private String password;
    public int getId() {
        return id;
    }

}
