package com.github.oopetris;

import static org.joou.Unsigned.*;

import org.joou.UByte;
import org.joou.UInteger;
import org.joou.ULong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Correct {

    private static Map<String, AdditionalInformationValue> getAdditionalInformation() {
        Map<String, AdditionalInformationValue> information = new HashMap<>();


        information.put("mode", new AdditionalInformationValue("single_player"));

        information.put("date", new AdditionalInformationValue(ulong(1710635321)));

        information.put("platform", new AdditionalInformationValue("pc"));


        return information;
    }

    private static List<TetrionRecord> getRecords() {
        List<TetrionRecord> records = new ArrayList<>();


        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(123), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(133), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(136), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(145), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(150), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(157), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(161), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(181), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(186), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(190), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(198), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(208), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(214), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(222), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(252), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(257), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveDownPressed, ulong(265), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveDownReleased, ulong(273), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(278), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveDownPressed, ulong(288), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(293), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(308), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(313), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(318), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveDownReleased, ulong(325), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveDownPressed, ulong(342), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveDownReleased, ulong(350), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(354), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(356), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(357), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(361), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(365), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(365), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(371), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(371), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(373), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(376), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(378), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(378), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(383), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(383), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(383), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(388), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(388), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(389), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(393), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(393), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(393), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(398), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(400), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(400), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(402), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(405), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(432), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(437), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(442), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(446), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(450), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(457), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(457), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(485), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(488), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldPressed, ulong(542), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldReleased, ulong(548), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(569), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(592), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(599), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(621), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(632), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(638), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(638), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(645), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(645), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(667), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(689), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(697), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(697), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(728), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(735), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(737), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(751), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(756), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(763), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(769), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(770), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(776), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(779), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(781), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(789), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(802), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(807), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(813), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(819), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(833), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(839), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(845), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(852), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(870), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(878), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(895), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(897), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(902), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(913), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(920), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(936), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(938), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(960), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(967), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(969), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(971), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(986), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(992), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(1000), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(1009), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(1044), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(1050), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(1068), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(1074), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(1081), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(1090), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(1112), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(1116), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(1155), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(1165), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(1179), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(1188), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(1214), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(1222), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(1229), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(1238), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(1242), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(1250), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(1264), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(1270), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(1281), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(1287), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(1305), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(1314), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(1322), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(1337), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(1345), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(1351), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(1364), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(1371), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(1378), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(1384), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(1393), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(1400), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(1415), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(1420), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(1425), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(1440), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(1443), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(1454), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(1461), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(1468), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(1473), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(1483), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(1487), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(1491), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(1496), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(1502), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(1508), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(1513), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(1518), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(1523), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(1529), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(1539), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(1547), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(1553), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(1558), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(1562), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(1567), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(1575), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(1590), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(1597), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(1599), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(1602), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(1615), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(1619), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(1625), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(1639), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(1647), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(1663), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(1664), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(1671), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(1690), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(1692), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(1695), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(1698), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(1707), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(1716), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(1723), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(1723), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(1728), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(1730), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(1748), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(1753), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(1779), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(1785), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(1799), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(1802), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(1804), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(1824), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(1826), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(1831), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(1839), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(1846), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(1858), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(1859), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(1885), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(1889), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(1903), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(1908), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(1924), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(1931), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(1935), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(1941), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(1962), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(1979), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(1985), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(1994), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(2005), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(2007), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(2026), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(2031), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(2036), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(2043), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(2050), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(2056), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(2075), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(2079), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(2081), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(2088), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(2107), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(2117), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(2124), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(2130), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(2141), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(2149), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(2161), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(2168), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(2174), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(2180), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(2185), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(2196), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(2201), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(2202), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(2203), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(2223), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(2240), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(2247), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(2261), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(2267), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(2271), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(2277), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(2292), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(2299), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(2308), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(2314), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(2334), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(2343), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(2353), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(2359), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(2361), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(2368), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(2376), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(2384), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(2391), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(2411), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(2419), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(2430), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(2431), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(2437), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(2463), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(2464), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(2469), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(2487), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(2508), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(2515), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldPressed, ulong(2609), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldReleased, ulong(2617), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(2630), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(2651), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveDownPressed, ulong(2667), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveDownReleased, ulong(2702), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(2702), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(2718), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveDownPressed, ulong(2731), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveDownReleased, ulong(2738), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(2786), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(2811), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveDownPressed, ulong(2823), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveDownReleased, ulong(2832), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveDownPressed, ulong(2840), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveDownReleased, ulong(2846), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveDownPressed, ulong(2853), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveDownReleased, ulong(2859), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveDownPressed, ulong(2864), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveDownReleased, ulong(2869), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(2876), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(2885), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveDownPressed, ulong(2896), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveDownReleased, ulong(2903), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(2955), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(2960), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(2977), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(2983), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(2996), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(3003), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(3013), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(3020), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(3039), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(3051), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(3057), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(3072), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(3078), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(3088), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(3102), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(3109), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldPressed, ulong(3120), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldReleased, ulong(3127), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(3134), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(3142), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(3151), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(3160), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(3162), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(3168), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(3184), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(3192), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(3201), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(3230), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(3232), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(3240), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(3251), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(3268), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(3272), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(3278), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldPressed, ulong(3284), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldReleased, ulong(3291), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(3306), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(3318), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(3325), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(3332), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(3336), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(3341), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(3356), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(3385), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(3385), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(3390), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(3405), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(3411), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(3415), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(3430), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(3460), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(3467), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(3474), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(3481), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(3509), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(3517), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(3531), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(3538), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(3546), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(3552), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(3556), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(3576), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldPressed, ulong(3595), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldReleased, ulong(3603), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(3608), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(3617), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(3625), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(3636), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(3638), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(3643), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(3652), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(3661), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(3680), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(3689), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(3698), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(3705), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(3710), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(3715), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(3722), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(3729), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(3731), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(3737), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(3751), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(3760), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(3763), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(3768), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(3784), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(3789), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(3823), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(3829), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(3845), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(3852), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(3918), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(3924), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(3948), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(3953), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(3965), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(3971), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldPressed, ulong(4036), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldReleased, ulong(4043), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(4069), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(4075), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(4079), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(4090), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(4094), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(4096), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(4103), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(4108), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(4124), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(4129), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(4138), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(4144), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(4160), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(4181), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(4198), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(4206), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(4216), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(4223), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(4227), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(4237), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(4241), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(4246), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(4251), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(4258), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(4266), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(4272), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(4279), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(4289), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(4291), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(4298), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(4350), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(4357), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(4372), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(4379), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(4402), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(4407), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(4418), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(4422), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(4433), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(4439), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(4450), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(4458), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(4465), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(4473), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(4473), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(4481), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(4489), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(4501), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(4502), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(4505), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(4540), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(4547), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(4553), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(4571), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldPressed, ulong(4578), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldReleased, ulong(4584), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(4593), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(4596), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(4604), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(4620), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(4629), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(4636), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(4642), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(4642), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(4665), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(4671), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(4673), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(4688), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(4708), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(4715), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(4729), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(4733), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(4740), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(4744), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(4753), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(4766), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(4774), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(4779), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(4780), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(4788), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(4804), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(4812), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(4820), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(4831), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(4839), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(4844), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(4855), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(4863), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(4870), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(4876), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(4885), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(4892), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(4900), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(4908), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldPressed, ulong(4916), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldReleased, ulong(4925), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(4949), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(4956), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(4960), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(4968), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(4975), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(4980), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(4982), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(4986), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(4988), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(4995), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(5012), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(5019), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(5025), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(5039), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(5043), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(5043), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(5048), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(5056), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(5063), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(5073), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(5073), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(5080), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(5104), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(5111), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(5116), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(5120), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(5132), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(5138), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(5148), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(5154), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(5159), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(5166), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(5168), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(5177), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(5185), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(5199), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(5202), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(5205), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(5227), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(5239), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(5251), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(5272), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldPressed, ulong(5282), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldReleased, ulong(5290), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(5296), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(5308), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(5309), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(5315), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(5322), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(5327), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(5336), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(5341), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(5353), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(5359), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(5383), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(5395), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(5395), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(5401), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(5414), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(5427), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(5429), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(5433), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldPressed, ulong(5456), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldReleased, ulong(5463), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(5475), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(5506), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(5506), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(5513), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(5530), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(5538), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(5547), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(5559), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(5566), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(5573), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(5592), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(5600), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(5616), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(5621), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(5631), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(5637), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(5650), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(5657), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(5683), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(5690), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(5698), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(5707), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(5721), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(5731), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(5760), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(5766), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(5769), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(5778), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldPressed, ulong(5801), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.HoldReleased, ulong(5807), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(5812), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(5837), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(5842), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(5849), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(5857), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(5864), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(5867), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(5875), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(5889), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(5896), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(5902), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(5913), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(5944), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(5950), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(5956), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(5976), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(5982), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(6001), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(6023), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(6023), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(6031), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(6045), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(6045), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(6052), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(6062), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(6072), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(6077), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(6092), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(6093), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(6098), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightPressed, ulong(6133), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.RotateRightReleased, ulong(6141), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftPressed, ulong(6142), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveLeftReleased, ulong(6149), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(6162), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(6169), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightPressed, ulong(6182), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.MoveRightReleased, ulong(6189), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(6212), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(6218), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(6223), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(6227), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(6233), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(6236), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(6242), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(6246), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(6252), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(6255), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(6261), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(6264), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(6268), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(6272), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(6277), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropReleased, ulong(6281), ubyte(0)));
        records.add(new TetrionRecord(InputEvent.DropPressed, ulong(6287), ubyte(0)));


        return records;
    }

    private static List<TetrionRecord> getSnapshots() {
        List<TetrionSnapshot> snapshots = new ArrayList<>();


        snapshots.add(new TetrionSnapshot(
                uint(0), uint(0),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T)),
                ulong(56), ulong(181), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(0),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S)),
                ulong(156), ulong(356), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(0),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J)),
                ulong(224), ulong(371), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(0),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L)),
                ulong(288), ulong(383), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(0),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I)),
                ulong(344), ulong(393), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(0),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O)),
                ulong(416), ulong(432), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(0),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z)),
                ulong(468), ulong(442), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(0),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(11)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(12)), TetrominoType.J)),
                ulong(512), ulong(450), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(0),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(11)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.I)),
                ulong(556), ulong(485), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(0),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(11)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z)),
                ulong(612), ulong(621), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(0),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(11)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S)),
                ulong(664), ulong(689), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(0),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(11)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T)),
                ulong(708), ulong(763), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(1),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(11)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(8), ubyte(12)), TetrominoType.L)),
                ulong(780), ulong(895), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(1),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(11)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(8), ubyte(12)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(1), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(2), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.T)),
                ulong(804), ulong(1155), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(1),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(11)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(8), ubyte(12)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(1), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(2), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.Z)),
                ulong(852), ulong(1214), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(1),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(11)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(8), ubyte(12)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(1), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(2), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(11)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(13)), TetrominoType.S)),
                ulong(892), ulong(1264), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(1),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(11)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(8), ubyte(12)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(1), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(2), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(11)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(10)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(7), ubyte(10)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(7), ubyte(11)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(7), ubyte(12)), TetrominoType.J)),
                ulong(924), ulong(1364), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(1),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(11)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(8), ubyte(12)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(1), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(2), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(11)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(10)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(7), ubyte(10)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(7), ubyte(11)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(7), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(10)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(11)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.L)),
                ulong(960), ulong(1415), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(1),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(11)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(8), ubyte(12)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(1), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(2), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(11)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(10)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(7), ubyte(10)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(7), ubyte(11)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(7), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(10)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(11)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(7), ubyte(8)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(8)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(9)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(9)), TetrominoType.O)),
                ulong(984), ulong(1518), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(2),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(12)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(11)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(7), ubyte(11)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(7), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(11)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(7), ubyte(9)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(9)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(10)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(10)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(11)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(9), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(9), ubyte(13)), TetrominoType.I)),
                ulong(1064), ulong(1553), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(2),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(12)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(11)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(7), ubyte(11)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(7), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(11)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(7), ubyte(9)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(9)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(10)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(10)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(11)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(9), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(9), ubyte(13)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(10)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(11)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(11)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.Z)),
                ulong(1100), ulong(1615), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(3),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(7), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(7), ubyte(10)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(10)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(11)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(11)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(9), ubyte(13)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(11)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(13)), TetrominoType.J)),
                ulong(1180), ulong(1664), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(3),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(7), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(7), ubyte(10)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(10)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(11)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(11)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(9), ubyte(13)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(11)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(13)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(1), ubyte(11)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(2), ubyte(11)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(2), ubyte(12)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.L)),
                ulong(1220), ulong(1748), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(3),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(7), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(7), ubyte(10)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(10)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(11)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(11)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(9), ubyte(13)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(11)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(13)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(1), ubyte(11)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(2), ubyte(11)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(2), ubyte(12)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(0), ubyte(9)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(10)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(10)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(11)), TetrominoType.T)),
                ulong(1252), ulong(1824), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(5),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(12)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(12)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(0), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(13)), TetrominoType.I)),
                ulong(1388), ulong(1885), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(5),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(12)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(12)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(0), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(13)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.S)),
                ulong(1432), ulong(1935), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(5),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(12)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(12)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(0), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(13)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(10)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(10)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(6), ubyte(11)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(11)), TetrominoType.O)),
                ulong(1468), ulong(2026), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(5),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(12)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(12)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(0), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(13)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(10)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(10)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(6), ubyte(11)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(11)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(4), ubyte(11)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(11)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(10)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(9)), TetrominoType.J)),
                ulong(1492), ulong(2174), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(5),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(12)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(12)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(0), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(13)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(10)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(10)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(6), ubyte(11)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(11)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(4), ubyte(11)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(11)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(10)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(9)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(1), ubyte(11)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(2), ubyte(11)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(2), ubyte(12)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.Z)),
                ulong(1524), ulong(2271), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(5),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(12)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(12)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(0), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(13)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(10)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(10)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(6), ubyte(11)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(11)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(4), ubyte(11)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(11)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(10)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(9)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(1), ubyte(11)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(2), ubyte(11)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(2), ubyte(12)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(2), ubyte(9)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(2), ubyte(10)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(10)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(11)), TetrominoType.S)),
                ulong(1556), ulong(2353), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(8),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.S)),
                ulong(1896), ulong(2431), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(8),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O)),
                ulong(1972), ulong(2732), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(8),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(14)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(14)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(15)), TetrominoType.O)),
                ulong(2040), ulong(2949), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(0), uint(8),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(14)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(14)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(4), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.T)),
                ulong(2084), ulong(3013), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(1), uint(10),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(2), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(16)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(17)), TetrominoType.I)),
                ulong(2340), ulong(3160), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(1), uint(10),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(2), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(16)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z)),
                ulong(2392), ulong(3232), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(1), uint(10),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(2), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(16)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S)),
                ulong(2432), ulong(3385), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(1), uint(10),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(2), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(16)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(7), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(12)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(1), ubyte(14)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(1), ubyte(15)), TetrominoType.J)),
                ulong(2476), ulong(3474), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(1), uint(11),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(16)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(2), ubyte(14)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(1), ubyte(14)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(1), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(13)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(14)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(15)), TetrominoType.I)),
                ulong(2604), ulong(3636), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(1), uint(11),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(16)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(2), ubyte(14)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(1), ubyte(14)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(1), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(13)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(14)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(1), ubyte(12)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(12)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.O)),
                ulong(2648), ulong(3698), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(1), uint(12),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(0), ubyte(16)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(8), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(2), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(1), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(14)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(14)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(14)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.T)),
                ulong(2776), ulong(3784), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(1), uint(13),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(16)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(0), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(0), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(1), ubyte(14)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(14)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(16)), TetrominoType.J)),
                ulong(2900), ulong(3918), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(1), uint(14),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(0), ubyte(16)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(1), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(4), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(7), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(7), ubyte(17)), TetrominoType.L)),
                ulong(3032), ulong(4138), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(1), uint(14),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(0), ubyte(16)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(1), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(4), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(7), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(7), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(14)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(14)), TetrominoType.O)),
                ulong(3080), ulong(4216), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(1), uint(14),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(0), ubyte(16)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(1), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(4), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(7), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(7), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(1), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(13)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(14)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(14)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(14)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.T)),
                ulong(3132), ulong(4291), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(1), uint(15),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(7), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(1), ubyte(14)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(14)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(16)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.I)),
                ulong(3264), ulong(4372), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(1), uint(16),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(16)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(3), ubyte(16)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.S)),
                ulong(3400), ulong(4433), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(1), uint(16),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(16)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(3), ubyte(16)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(16)), TetrominoType.Z)),
                ulong(3448), ulong(4665), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(1), uint(16),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(16)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(3), ubyte(16)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(17)), TetrominoType.O)),
                ulong(3508), ulong(4740), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(1), uint(16),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(16)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(3), ubyte(16)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.L)),
                ulong(3552), ulong(5012), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(1), uint(16),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(16)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(3), ubyte(16)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.T)),
                ulong(3604), ulong(5073), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(1), uint(16),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(15)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(9), ubyte(16)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(16)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(3), ubyte(16)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(7), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(13)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(14)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(15)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(7), ubyte(15)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(15)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(15)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(15)), TetrominoType.Z)),
                ulong(3652), ulong(5159), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(1), uint(19),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(4), ubyte(16)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(17)), TetrominoType.I)),
                ulong(4308), ulong(5199), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(2), uint(20),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(2), ubyte(18)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(2), ubyte(19)), TetrominoType.L)),
                ulong(4492), ulong(5353), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(2), uint(20),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(17)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(2), ubyte(18)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(2), ubyte(19)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(7), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.S)),
                ulong(4560), ulong(5506), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(2), uint(21),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(2), ubyte(19)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(7), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T)),
                ulong(4736), ulong(5592), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(2), uint(21),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(2), ubyte(19)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(7), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(19)), TetrominoType.J)),
                ulong(4796), ulong(5889), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(2), uint(21),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(2), ubyte(19)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(7), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(19)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.O)),
                ulong(4856), ulong(5944), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(2), uint(21),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(18)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(6), ubyte(18)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(2), ubyte(19)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(7), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(17)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(19)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(16)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(16)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(17)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.S)),
                ulong(4912), ulong(6045), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(2), uint(22),
                List.of(new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(6), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(19)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(7), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(7), ubyte(18)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(3), ubyte(19)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(2), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(17)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(17)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(17)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(18)), TetrominoType.Z)),
                ulong(5092), ulong(6092), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(2), uint(23),
                List.of(new Mino(new MinoPosition(ubyte(7), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(2), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(19)), TetrominoType.I)),
                ulong(5272), ulong(6162), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(2), uint(23),
                List.of(new Mino(new MinoPosition(ubyte(7), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(2), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(19)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.J)),
                ulong(5328), ulong(6212), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(2), uint(23),
                List.of(new Mino(new MinoPosition(ubyte(7), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(2), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(19)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.S)),
                ulong(5380), ulong(6223), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(2), uint(23),
                List.of(new Mino(new MinoPosition(ubyte(7), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(2), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(19)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.I)),
                ulong(5424), ulong(6233), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(2), uint(23),
                List.of(new Mino(new MinoPosition(ubyte(7), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(2), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(19)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(3), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(10)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(11)), TetrominoType.T)),
                ulong(5464), ulong(6242), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(2), uint(23),
                List.of(new Mino(new MinoPosition(ubyte(7), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(2), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(19)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(3), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(10)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(3), ubyte(8)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(8)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(9)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(9)), TetrominoType.Z)),
                ulong(5496), ulong(6252), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(2), uint(23),
                List.of(new Mino(new MinoPosition(ubyte(7), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(2), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(19)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(3), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(10)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(3), ubyte(8)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(8)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(9)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(9)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(7)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(4), ubyte(7)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(7)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(6)), TetrominoType.L)),
                ulong(5520), ulong(6261), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(2), uint(23),
                List.of(new Mino(new MinoPosition(ubyte(7), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(2), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(19)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(3), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(10)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(3), ubyte(8)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(8)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(9)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(9)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(7)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(4), ubyte(7)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(7)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(6)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(4)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(5)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(5)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(5)), TetrominoType.J)),
                ulong(5536), ulong(6268), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(2), uint(23),
                List.of(new Mino(new MinoPosition(ubyte(7), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(2), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(19)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(3), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(10)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(3), ubyte(8)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(8)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(9)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(9)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(7)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(4), ubyte(7)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(7)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(6)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(4)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(5)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(5)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(5)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(3)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(3)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(4), ubyte(4)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(4)), TetrominoType.O)),
                ulong(5548), ulong(6277), ubyte(0)
        ));
        snapshots.add(new TetrionSnapshot(
                uint(2), uint(23),
                List.of(new Mino(new MinoPosition(ubyte(7), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(2), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(19)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(3), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(10)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(3), ubyte(8)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(8)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(9)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(9)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(7)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(4), ubyte(7)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(7)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(6)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(4)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(5)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(5)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(5)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(3)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(3)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(4), ubyte(4)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(4)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(2)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(2)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(1)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(1)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(0)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(0)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(0)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(0)), TetrominoType.I)),
                ulong(5552), ulong(6287), ubyte(0)
        ));

        snapshots.add(new TetrionSnapshot(
                uint(2), uint(23),
                List.of(new Mino(new MinoPosition(ubyte(7), ubyte(19)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(2), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(18)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(2), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(19)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(8), ubyte(18)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(8), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(9), ubyte(19)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(1), ubyte(18)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(1), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(0), ubyte(19)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(17)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(18)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(19)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(15)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(6), ubyte(16)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(14)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(13)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(12)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(3), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(4), ubyte(10)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(5), ubyte(11)), TetrominoType.T),
                        new Mino(new MinoPosition(ubyte(3), ubyte(8)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(8)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(4), ubyte(9)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(5), ubyte(9)), TetrominoType.Z),
                        new Mino(new MinoPosition(ubyte(3), ubyte(7)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(4), ubyte(7)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(7)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(5), ubyte(6)), TetrominoType.L),
                        new Mino(new MinoPosition(ubyte(3), ubyte(4)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(3), ubyte(5)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(5)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(5), ubyte(5)), TetrominoType.J),
                        new Mino(new MinoPosition(ubyte(4), ubyte(3)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(3)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(4), ubyte(4)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(5), ubyte(4)), TetrominoType.O),
                        new Mino(new MinoPosition(ubyte(3), ubyte(2)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(2)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(4), ubyte(1)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(5), ubyte(1)), TetrominoType.S),
                        new Mino(new MinoPosition(ubyte(3), ubyte(0)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(4), ubyte(0)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(5), ubyte(0)), TetrominoType.I),
                        new Mino(new MinoPosition(ubyte(6), ubyte(0)), TetrominoType.I)),
                ulong(5552), ulong(6287), ubyte(0)
        ));

        return snapshots;
    }

    public static RecordingInformation getCorrectRecordings() {

        Map<String, AdditionalInformationValue> information = getAdditionalInformation();

        List<TetrionRecord> records = getRecords();

        List<TetrionSnapshot> snapshots = getSnapshots();

        List<TetrionHeader> tetrionHeaders = new ArrayList<>();

        { tetrionHeaders.add(new TetrionHeader(ulong(1710635321166006L), uint(0))); }

        UByte version = ubyte(1);

        return new RecordingInformation(information, records, snapshots, tetrionHeaders, version);
    }
}
