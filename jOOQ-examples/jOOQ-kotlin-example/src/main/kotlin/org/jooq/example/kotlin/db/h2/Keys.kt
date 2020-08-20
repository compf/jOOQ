/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.kotlin.db.h2


import org.jooq.ForeignKey
import org.jooq.UniqueKey
import org.jooq.example.kotlin.db.h2.tables.Author
import org.jooq.example.kotlin.db.h2.tables.Book
import org.jooq.example.kotlin.db.h2.tables.BookStore
import org.jooq.example.kotlin.db.h2.tables.BookToBookStore
import org.jooq.example.kotlin.db.h2.tables.records.AuthorRecord
import org.jooq.example.kotlin.db.h2.tables.records.BookRecord
import org.jooq.example.kotlin.db.h2.tables.records.BookStoreRecord
import org.jooq.example.kotlin.db.h2.tables.records.BookToBookStoreRecord
import org.jooq.impl.DSL
import org.jooq.impl.Internal


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * PUBLIC.
 */
@Suppress("UNCHECKED_CAST")
object Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    val PK_T_AUTHOR = UniqueKeys0.PK_T_AUTHOR
    val PK_T_BOOK = UniqueKeys0.PK_T_BOOK
    val UK_T_BOOK_STORE_NAME = UniqueKeys0.UK_T_BOOK_STORE_NAME
    val PK_B2BS = UniqueKeys0.PK_B2BS

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    val FK_T_BOOK_AUTHOR_ID = ForeignKeys0.FK_T_BOOK_AUTHOR_ID
    val FK_T_BOOK_CO_AUTHOR_ID = ForeignKeys0.FK_T_BOOK_CO_AUTHOR_ID
    val FK_B2BS_B_ID = ForeignKeys0.FK_B2BS_B_ID
    val FK_B2BS_BS_NAME = ForeignKeys0.FK_B2BS_BS_NAME

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private object UniqueKeys0 {
        val PK_T_AUTHOR: UniqueKey<AuthorRecord> = Internal.createUniqueKey(Author.AUTHOR, DSL.name("PK_T_AUTHOR"), arrayOf(Author.AUTHOR.ID), true)
        val PK_T_BOOK: UniqueKey<BookRecord> = Internal.createUniqueKey(Book.BOOK, DSL.name("PK_T_BOOK"), arrayOf(Book.BOOK.ID), true)
        val UK_T_BOOK_STORE_NAME: UniqueKey<BookStoreRecord> = Internal.createUniqueKey(BookStore.BOOK_STORE, DSL.name("UK_T_BOOK_STORE_NAME"), arrayOf(BookStore.BOOK_STORE.NAME), true)
        val PK_B2BS: UniqueKey<BookToBookStoreRecord> = Internal.createUniqueKey(BookToBookStore.BOOK_TO_BOOK_STORE, DSL.name("PK_B2BS"), arrayOf(BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID), true)
    }

    private object ForeignKeys0 {
        val FK_T_BOOK_AUTHOR_ID: ForeignKey<BookRecord, AuthorRecord> = Internal.createForeignKey(Book.BOOK, DSL.name("FK_T_BOOK_AUTHOR_ID"), arrayOf(Book.BOOK.AUTHOR_ID), Keys.PK_T_AUTHOR, arrayOf(Author.AUTHOR.ID), true)
        val FK_T_BOOK_CO_AUTHOR_ID: ForeignKey<BookRecord, AuthorRecord> = Internal.createForeignKey(Book.BOOK, DSL.name("FK_T_BOOK_CO_AUTHOR_ID"), arrayOf(Book.BOOK.CO_AUTHOR_ID), Keys.PK_T_AUTHOR, arrayOf(Author.AUTHOR.ID), true)
        val FK_B2BS_B_ID: ForeignKey<BookToBookStoreRecord, BookRecord> = Internal.createForeignKey(BookToBookStore.BOOK_TO_BOOK_STORE, DSL.name("FK_B2BS_B_ID"), arrayOf(BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID), Keys.PK_T_BOOK, arrayOf(Book.BOOK.ID), true)
        val FK_B2BS_BS_NAME: ForeignKey<BookToBookStoreRecord, BookStoreRecord> = Internal.createForeignKey(BookToBookStore.BOOK_TO_BOOK_STORE, DSL.name("FK_B2BS_BS_NAME"), arrayOf(BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_STORE_NAME), Keys.UK_T_BOOK_STORE_NAME, arrayOf(BookStore.BOOK_STORE.NAME), true)
    }
}
