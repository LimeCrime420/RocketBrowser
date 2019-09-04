package org.mozilla.rocket.msrp.data

object TestData {

    val mission01 = Mission(
        mid = "000001",
        title = "TypeDaily Mission 1",
        description = "Click vertical everyday",
        expireDate = System.currentTimeMillis(),

        events = listOf("CLICK_PANEL_PIN_TOP_SITE"),

        important = true,
        status = 0, // 0: new , 1: joined 2. redeem,

        endpoint = "/v1/daily_mission/xxdase-eadsad",
        redeem = "/v1/redeem/asdsa-esadsa=das-dased-sadas",

        missionProgress = MissionProgress.TypeDaily(
            // progress, TODO: make it another class
            joinDate = null,
            currentDay = null,
            totalDays = 10
        )
    )

    val mission02 = Mission(
        mid = "000002",
        title = "TypeDaily Mission 1",
        description = "Click vertical everyday",
        expireDate = System.currentTimeMillis(),

        events = listOf("CLICK_PANEL_PIN_TOP_SITE"),

        important = true,
        status = 2, // 0: new , 1: joined 2. redeem,
        endpoint = "/v1/daily_mission/xxdase-eadsad",
        redeem = "/v1/redeem/asdsa-esadsa=das-dased-sadas",

        missionProgress = MissionProgress.TypeDaily(
            // progress, TODO: make it another class
            joinDate = null,
            currentDay = null,
            totalDays = 10
        )
    )

    val missions = listOf(
        mission01,
        mission02
    )
}