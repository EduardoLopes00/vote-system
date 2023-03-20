package com.testdbserver.desafiovotacao.data.models;

import com.testdbserver.desafiovotacao.infra.enums.AssociateStatusEnum;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name="associate")
public class Associate {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name="cpf", nullable = false)
    private String cpf;

    @Column(name="email", nullable = false)
    private String email;

    @Column(name="status", nullable = false)
    @Enumerated(EnumType.STRING)
    private AssociateStatusEnum status;
}
