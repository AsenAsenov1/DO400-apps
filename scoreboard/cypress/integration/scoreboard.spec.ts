beforeEach(() => {
    // GIVEN the user is on the app
    cy.visit("/");
});

describe("add player", () => {
    it("should add a player", () => {
        // AND the user has entered 'bobby' into the 'Player Name' field
        cy.get("form").find('[placeholder="Player Name"]').type("bobby");

        // WHEN they submit the form
        cy.get("form").submit();

        // THEN 'bobby' should be added to the players
        cy.get("#player-scores").should("contain", "bobby");
    });
<<<<<<< HEAD
=======

    it("should only allow names of max length 10", () => {
        // AND the user has entered 10 characters into the 'Player Name' field
        const nameField = cy.get("form").find('[placeholder="Player Name"]');
        nameField.clear();
        nameField.type("1234567890");

        // WHEN the user enters an 11th character
        nameField.type("1");

        // THEN the 'Player Name' field should not change
        nameField.invoke("val").should("equal", "1234567890");
    });
>>>>>>> cd26c9ed54c0d8e5c46dbf1be2517a20f4d7f9a1
});

describe("update score", () => {
    beforeEach(() => {
        // AND the player 'tom' exists
        cy.get("form").find('[placeholder="Player Name"]').type("tom");
        cy.get("form").submit();
    });

    it("should increase a player's score", () => {
        // AND tom has a score of 0
        cy.get("#player-scores").should("contain", "tom: 0");

        // WHEN the user hits '+' next to 'tom'
        cy.get("#player-scores")
            .contains("tom")
            .siblings()
            .contains("+")
            .click();

        // THEN 'tom's score should be 1
        cy.get("#player-scores").should("contain", "tom: 1");
    });

<<<<<<< HEAD
    it.skip("should decrease a player's score", () => {
=======
    it("should decrease a player's score", () => {
>>>>>>> cd26c9ed54c0d8e5c46dbf1be2517a20f4d7f9a1
        // AND tom has a score of 0
        cy.get("#player-scores").should("contain", "tom: 0");

        // WHEN the user hits '-' next to 'tom'
        cy.get("#player-scores")
            .contains("tom")
            .siblings()
            .contains("-")
            .click();

        // THEN 'tom's score should be -1
<<<<<<< HEAD
        cy.get("#player-scores").should("contain", "tom: 0");
=======
        cy.get("#player-scores").should("contain", "tom: -1");
>>>>>>> cd26c9ed54c0d8e5c46dbf1be2517a20f4d7f9a1
    });
});
