package com.ecobenchmark.kotlinspringjpa.entities

import org.hibernate.annotations.GenericGenerator
import java.time.Instant
import java.util.*
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
data class Account(
    var login: String,
    var creationDate: Instant,
    @OneToMany(mappedBy = "account")
    var lists: List<ListEntity>
) {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    var id: UUID? = null
}
