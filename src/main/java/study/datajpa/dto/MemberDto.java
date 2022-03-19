package study.datajpa.dto;


import lombok.Data;
import study.datajpa.entity.Member;

@Data
public class MemberDto {

    private Long id;
    private String username;
    private String teamname;

    public MemberDto(Long id, String username, String teamname) {
        this.id = id;
        this.username = username;
        this.teamname = teamname;
    }

    public MemberDto(Member m) {
        this.id = m.getId();
        this.username = m.getUsername();
    }
}
