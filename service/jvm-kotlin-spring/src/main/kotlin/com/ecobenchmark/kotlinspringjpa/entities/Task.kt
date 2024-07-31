package com.ecobenchmark.kotlinspringjpa.entities

import org.hibernate.annotations.GenericGenerator
import java.time.Instant
import java.util.*
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne

@Entity
class Task(
    @ManyToOne
    var list: ListEntity,
    var name: String,
    var description: String,
    var creationDate: Instant,
) {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    var id: UUID? = null
}
