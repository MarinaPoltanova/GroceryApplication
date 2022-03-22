package com.example.searchcuisineappliction.data

import com.example.searchcuisineappliction.domain.model.RecipeItem

class DataInfo {
    public val recipeItems: MutableList<RecipeItem> = mutableListOf(
        RecipeItem(
            mapOf(
                Constance.SPAGETTI to "400 г",
                Constance.VETCHINA to "300 г",
                Constance.MASLO_OLIVE to "6 столовых ложек",
                Constance.CHESNOK to "2 зубчика",
                Constance.YAICHNI_ZHELTOK to "4 штуки",
                Constance.CIR_PARMEZAN to "100 г",
                Constance.SLIVKI_10 to "200 мл",
                Constance.SOLT to "по вкусу",
                Constance.PEPER_BLACK to "по вкусу"
            ),
            mapOf(Constance.PASTA_KARBONARA to Constance.RECIPE_PASTA_KARBONARA)
        ),
        RecipeItem(
            mapOf(
                Constance.FARSH_MYASN to "600 г",
                Constance.SOUSE_BOL to "600 г",
                Constance.MASLO_SLIV to "60 г",
                Constance.MUKA to "2,5 столовые ложки",
                Constance.MASLO_OLIVE to "2 столовые ложки",
                Constance.MOLOKO to "750 мл",
                Constance.LIST_LAZANI to "10 штук",
                Constance.CIR_TVERDI to "500 г"
            ), mapOf(
                Constance.LAZANIA_CLASSIC to Constance.RECIPE_LAZANIA_CLASSIC
            )
        ),
        RecipeItem(
            mapOf(
                Constance.KOLBASA to "200 г",
                Constance.CIR_MOZAR to "250 г",
                Constance.MASLO_OLIVE to "2 столовые ложки",
                Constance.TESTO_PIZZA to "1 штука",
                Constance.PEPER_CHILI to "1 штука",
                Constance.POMIDORY_V_SOKU to "1 банка",
                Constance.OREGANO to "1 чайная ложка",
                Constance.BASILIK to "1 чайная ложка",
                Constance.CHESNOK to "1 зубчик",
                Constance.SAHAR to "1 чайная ложка",
                Constance.SOLT to "по вкусу",
                Constance.PEPER_BLACK to "по вкусу"
            ),
            mapOf(Constance.PIZZA_PEPPERONI to Constance.RECIPE_PIZZA_PEPPERONI)
        ),
        RecipeItem(
            mapOf(
                Constance.POMIDORI to "1 штука",
                Constance.SALAT_ZELEN to "1 пучок",
                Constance.FILE_KURIN to "300 г",
                Constance.HLEB to "6 кусков",
                Constance.SOUSE_CEZ to "по вкусу",
                Constance.MASLO_SLIV to "2 столовые ложки",
                Constance.CHESNOK to "2 зубчика",
                Constance.CIR_PARMEZAN to "по вкусу"
            ),
            mapOf(Constance.SALAT_CEZAR to Constance.RECIPE_SALAT_CEZAR)
        ),
        RecipeItem(
            mapOf(
                Constance.SVEKLA to "300 г",
                Constance.MYASO to "500 г",
                Constance.LUK_REPCH to "1 штука",
                Constance.KAPUSTA to "200 г",
                Constance.KORENIA to "по вкусу",
                Constance.TOMATO_PURE to "2 столовые ложки",
                Constance.MORKOV to "1 штука",
                Constance.SAHAR to "1 столовая ложка",
                Constance.UKSUS to "1 столовая ложка",
                Constance.SOLT to "по вкусу"
            ), mapOf(
                Constance.BORSH to Constance.RECIPE_BORSH
            )
        ),
        RecipeItem(
            mapOf(
                Constance.KURIZA to "1,2 кг",
                Constance.MASLO_SLIV to "140 г",
                Constance.PETRUSHKA to "20 г",
                Constance.SOLT to "½ чайные ложки",
                Constance.YAIZO to "2 штуки",
                Constance.MOLOKO to "100 мл",
                Constance.MUKA to "60 г",
                Constance.SUHARI to "140 г",
                Constance.MASLO_RASTIT to "300 мл"
            ), mapOf(
                Constance.KOTLETA_PO_KIEVSKI to Constance.RECIPE_KOTLETA_PO_KIEVSKI
            )
        ),
        RecipeItem(
            mapOf(
                Constance.KARTOFEL to "1 кг",
                Constance.YAIZO to "1 шт",
                Constance.MUKA to "1 ст.л.",
                Constance.SMETANA to "2 ч.л.",
                Constance.SOLT to "По вкусу",
                Constance.MASLO_RASTIT to "По вкусу (для жарки)"
            ),
            mapOf(Constance.DRANIKI to Constance.RECIPE_DRANIKI)
        ),
        RecipeItem(
            mapOf(
                Constance.BULION_MIX to "2 л",
                Constance.FARSH_MYASN to "400 г",
                Constance.KARTOFEL to "6 шт",
                Constance.PSHENO to "50 г",
                Constance.RICE to "50 г",
                Constance.TOMATO_PASTA to "2 ст. л.",
                Constance.LUK_REPCH to "(крупный, 1/2 - в рис, 1/2 - в суп) - 1 шт",
                Constance.YAICHNI_ZHELTOK to "1 шт",
                Constance.MASLO_SLIV to "2 ст. л.",
                Constance.ZELEN to "1 пуч.",
                Constance.HMELI_SUNELI to "1 ст. л.",
                Constance.PEPER_BLACK to "по вкусу",
                Constance.SOLT to "по вкусу"
            ),
            mapOf(
                Constance.KOLOLAK to Constance.RECIPE_KOLOLAK
            )
        ),
        RecipeItem(
            mapOf(
                Constance.MYKOT_GOV to "1 кг",
                Constance.LUK_REPCH to "2 шт",
                Constance.YAIZO to "1 шт",
                Constance.MUKA to "2 ст л",
                Constance.KONIAK to "50 гр",
                Constance.MOLOKO to "3/4 стакана",
                Constance.MASLO_SLIV to "По вкусу",
                Constance.PEPER_BLACK to "По вкусу",
                Constance.PEPER_RED to "По вкусу",
                Constance.SOLT to "По вкусу"
            ),
            mapOf(Constance.KUFTA to Constance.RECIPE_KUFTA)
        ),
        RecipeItem(
            mapOf(
                Constance.LISTYA_VINOGR to "45 штук",
                Constance.GOVIADINA to "700 г",
                Constance.SVININA to "300 г",
                Constance.LUK_REPCH to "100 г",
                Constance.RICE to "300 г",
                Constance.MASLO_SLIV to "100 г",
                Constance.ZELEN to "150 г"
            ),
            mapOf(Constance.TOLMA to Constance.RECIPE_TOLMA)
        ),
        RecipeItem(
            mapOf(
                Constance.BECON to "50 гр",
                Constance.BULOCHKI to "4 шт",
                Constance.FARSH_MYASN to "500 г",
                Constance.KAPERCI to "10 гр",
                Constance.PEPER_SPICY to "По вкусу",
                Constance.SOLT to "По вкусу",
                Constance.OVOSHI to "По желанию"
            ),
            mapOf(Constance.USA_GAMBURGER to Constance.RECIPE_USA_GAMBURGER)
        ),
        RecipeItem(
            mapOf(
                Constance.CIR_MOZAR to "80 г",
                Constance.KOTLETA to "360 г",
                Constance.YAIZO to "3 штуки",
                Constance.LISTIA_BASILIKA to "6 штук",
                Constance.PEPER_BLACK to "по вкусу",
                Constance.SMES_PERCEV to "по вкусу",
                Constance.SMES_TRAV to "по вкусу",
                Constance.SOLT to "по вкусу"
            ),
            mapOf(Constance.HOLLIWOOD_BIFSTAKE to Constance.RECIPE_HOLLIWOOD_BIFSTAKE)
        ),
        RecipeItem(
            mapOf(
                Constance.SOSISKI to "350 гр",
                Constance.MUKA to "100 гр",
                Constance.MUKA_KUKU to "100 гр",
                Constance.YAIZO to "1 шт.",
                Constance.MOLOKO to "50-100 мл",
                Constance.SOLT to "1 щепотка",
                Constance.SAHAR to "1/2 ч.л.",
                Constance.RAZRUHLITEL to "1/2 ч.л."
            ),
            mapOf(Constance.KORN_DOG to Constance.RECIPE_KORN_DOG)
        ),
        RecipeItem(
            mapOf(
                Constance.KOLBASA_KRACK to "400 г",
                Constance.SELDEREI to "300 г",
                Constance.PEPER_SLAD to "1 штука",
                Constance.LUK_REPCH to "1 штука",
                Constance.LUK_ZELEN to "1 пучок",
                Constance.PETRUSHKA to "1 пучок",
                Constance.CHESNOK to "3 зубчика",
                Constance.BULION_KUR to "2 л",
                Constance.KURIZA_GRIL to "1 штука",
                Constance.KREVETKI to "500 г",
                Constance.RICE to "400 г",
                Constance.PAPRIKA to "½ чайные ложки",
                Constance.OREGANO to "½ чайные ложки",
                Constance.LUK_SUSH to "½ чайные ложки",
                Constance.TIMIAN to "½ чайные ложки",
                Constance.CHESNOK_SUSH to "½ чайные ложки",
                Constance.PEPER_KAIENSKI to "½ чайные ложки",
                Constance.PEPER_CHILI_HLOP to "½ чайные ложки",
                Constance.PEPER_BLACK to "по вкусу",
                Constance.SOLT to "по вкусу",
                Constance.MUKA to "130 г",
                Constance.MASLO_RASTIT to "160 мл"
            ),
            mapOf(Constance.GAMBO to Constance.RECIPE_GAMBO)
        ),
        RecipeItem(
            mapOf(
                Constance.PEPER_SLAD to "2 кг",
                Constance.POMIDORI to "1 кг",
                Constance.LUK_REPCH to "4 шт",
                Constance.ZHIR_SVIN to "100 гр",
                Constance.SHPIK to "100 гр",
                Constance.PAPRIKA_SPACY to "5-7 гр",
                Constance.SOLT to "По вкусу"
            ),
            mapOf(Constance.LECHO to Constance.RECIPE_LECHO)
        ),
        RecipeItem(
            mapOf(
                Constance.FILE_IND to "400 гр",
                Constance.LUK_REPCH to "1 шт",
                Constance.MORKOV to "1 шт",
                Constance.PEPER_SLAD to "3 шт",
                Constance.POMIDORI to "3 шт",
                Constance.SMETANA to "150 гр",
                Constance.MUKA to "1 ст л",
                Constance.CHESNOK to "3 зубчика",
                Constance.PAPRIKA to "2 ч л",
                Constance.MASLO_RASTIT to "(для жарки) 3 ст л",
                Constance.SOLT_SEA to "По вкусу"
            ), mapOf(
                Constance.PAPRIKASH_FROM_TURKEY to Constance.RECIPE_PAPRIKASH_FROM_TURKEY
            )
        )
    )

    public var countryItaly = mutableListOf<String>(
        recipeItems[0].stepsMap.keys.toString(),
        recipeItems[1].stepsMap.keys.toString(),
        recipeItems[2].stepsMap.keys.toString(),
        recipeItems[3].stepsMap.keys.toString()
    )

    public var countryUkrine = mutableListOf<String>(
        recipeItems[4].stepsMap.keys.toString(),
        recipeItems[5].stepsMap.keys.toString(),
        recipeItems[6].stepsMap.keys.toString(),
    )

    public var countryArmeny = mutableListOf<String>(
        recipeItems[7].stepsMap.keys.toString(),
        recipeItems[8].stepsMap.keys.toString(),
        recipeItems[9].stepsMap.keys.toString(),
    )

    public var countryAmerica = mutableListOf<String>(
        recipeItems[10].stepsMap.keys.toString(),
        recipeItems[11].stepsMap.keys.toString(),
        recipeItems[12].stepsMap.keys.toString(),
        recipeItems[13].stepsMap.keys.toString(),
    )

    public var countryVengria = mutableListOf<String>(
        recipeItems[14].stepsMap.keys.toString(),
        recipeItems[15].stepsMap.keys.toString(),
    )
}