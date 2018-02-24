<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="KM2Tools"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="self"/>
		<constant value="getStringProperty"/>
		<constant value="MKM2!ModelElement;"/>
		<constant value="1"/>
		<constant value="J"/>
		<constant value="Sequence"/>
		<constant value="#native"/>
		<constant value="0"/>
		<constant value="properties"/>
		<constant value="2"/>
		<constant value="name"/>
		<constant value="J.=(J):J"/>
		<constant value="B.not():B"/>
		<constant value="18"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="value"/>
		<constant value="J.first():J"/>
		<constant value="9:2-9:6"/>
		<constant value="9:2-9:17"/>
		<constant value="9:31-9:32"/>
		<constant value="9:31-9:37"/>
		<constant value="9:40-9:44"/>
		<constant value="9:31-9:44"/>
		<constant value="9:2-9:45"/>
		<constant value="9:60-9:61"/>
		<constant value="9:60-9:67"/>
		<constant value="9:2-9:68"/>
		<constant value="9:2-9:77"/>
		<constant value="9:2-9:83"/>
		<constant value="p"/>
		<constant value="d"/>
		<constant value="getIntegerProperty"/>
		<constant value="15:2-15:6"/>
		<constant value="15:2-15:17"/>
		<constant value="15:31-15:32"/>
		<constant value="15:31-15:37"/>
		<constant value="15:40-15:44"/>
		<constant value="15:31-15:44"/>
		<constant value="15:2-15:45"/>
		<constant value="15:60-15:61"/>
		<constant value="15:60-15:67"/>
		<constant value="15:2-15:68"/>
		<constant value="15:2-15:77"/>
		<constant value="15:2-15:83"/>
		<constant value="getBooleanProperty"/>
		<constant value="21:2-21:6"/>
		<constant value="21:2-21:17"/>
		<constant value="21:31-21:32"/>
		<constant value="21:31-21:37"/>
		<constant value="21:40-21:44"/>
		<constant value="21:31-21:44"/>
		<constant value="21:2-21:45"/>
		<constant value="21:60-21:61"/>
		<constant value="21:60-21:67"/>
		<constant value="21:2-21:68"/>
		<constant value="21:2-21:77"/>
		<constant value="21:2-21:83"/>
		<constant value="get"/>
		<constant value="15"/>
		<constant value="element"/>
		<constant value="28:2-28:6"/>
		<constant value="28:2-28:17"/>
		<constant value="28:30-28:31"/>
		<constant value="28:30-28:36"/>
		<constant value="28:39-28:43"/>
		<constant value="28:30-28:43"/>
		<constant value="28:2-28:44"/>
		<constant value="28:2-28:53"/>
		<constant value="28:2-28:59"/>
		<constant value="28:2-28:67"/>
		<constant value="getRefSet"/>
		<constant value="21"/>
		<constant value="contents"/>
		<constant value="ModelElementRefVal"/>
		<constant value="KM2"/>
		<constant value="J.oclIsTypeOf(J):J"/>
		<constant value="36"/>
		<constant value="J.asSequence():J"/>
		<constant value="35:2-35:6"/>
		<constant value="35:2-35:17"/>
		<constant value="35:30-35:31"/>
		<constant value="35:30-35:36"/>
		<constant value="35:39-35:43"/>
		<constant value="35:30-35:43"/>
		<constant value="35:2-35:44"/>
		<constant value="35:2-35:53"/>
		<constant value="35:2-35:59"/>
		<constant value="35:2-35:68"/>
		<constant value="36:16-36:17"/>
		<constant value="36:30-36:52"/>
		<constant value="36:16-36:53"/>
		<constant value="35:2-36:55"/>
		<constant value="36:70-36:71"/>
		<constant value="36:70-36:79"/>
		<constant value="35:2-36:81"/>
		<constant value="35:2-36:95"/>
		<constant value="e"/>
		<constant value="getSet"/>
		<constant value="ModelElementVal"/>
		<constant value="43:2-43:6"/>
		<constant value="43:2-43:17"/>
		<constant value="43:30-43:31"/>
		<constant value="43:30-43:36"/>
		<constant value="43:39-43:43"/>
		<constant value="43:30-43:43"/>
		<constant value="43:2-43:44"/>
		<constant value="43:2-43:53"/>
		<constant value="43:2-43:59"/>
		<constant value="43:2-43:68"/>
		<constant value="44:16-44:17"/>
		<constant value="44:30-44:49"/>
		<constant value="44:16-44:50"/>
		<constant value="43:2-44:52"/>
		<constant value="44:67-44:68"/>
		<constant value="44:67-44:76"/>
		<constant value="43:2-44:78"/>
		<constant value="43:2-44:92"/>
	</cp>
	<operation name="1">
		<context type="2"/>
		<parameters>
		</parameters>
		<code>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="3" begin="0" end="-1"/>
		</localvariabletable>
	</operation>
	<operation name="4">
		<context type="5"/>
		<parameters>
			<parameter name="6" type="7"/>
		</parameters>
		<code>
			<push arg="8"/>
			<push arg="9"/>
			<new/>
			<push arg="8"/>
			<push arg="9"/>
			<new/>
			<load arg="10"/>
			<get arg="11"/>
			<iterate/>
			<store arg="12"/>
			<load arg="12"/>
			<get arg="13"/>
			<load arg="6"/>
			<call arg="14"/>
			<call arg="15"/>
			<if arg="16"/>
			<load arg="12"/>
			<call arg="17"/>
			<enditerate/>
			<iterate/>
			<store arg="12"/>
			<load arg="12"/>
			<get arg="18"/>
			<call arg="17"/>
			<enditerate/>
			<call arg="19"/>
			<get arg="18"/>
		</code>
		<linenumbertable>
			<lne id="20" begin="6" end="6"/>
			<lne id="21" begin="6" end="7"/>
			<lne id="22" begin="10" end="10"/>
			<lne id="23" begin="10" end="11"/>
			<lne id="24" begin="12" end="12"/>
			<lne id="25" begin="10" end="13"/>
			<lne id="26" begin="3" end="18"/>
			<lne id="27" begin="21" end="21"/>
			<lne id="28" begin="21" end="22"/>
			<lne id="29" begin="0" end="24"/>
			<lne id="30" begin="0" end="25"/>
			<lne id="31" begin="0" end="26"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="32" begin="9" end="17"/>
			<lve slot="2" name="33" begin="20" end="23"/>
			<lve slot="0" name="3" begin="0" end="26"/>
			<lve slot="1" name="13" begin="0" end="26"/>
		</localvariabletable>
	</operation>
	<operation name="34">
		<context type="5"/>
		<parameters>
			<parameter name="6" type="7"/>
		</parameters>
		<code>
			<push arg="8"/>
			<push arg="9"/>
			<new/>
			<push arg="8"/>
			<push arg="9"/>
			<new/>
			<load arg="10"/>
			<get arg="11"/>
			<iterate/>
			<store arg="12"/>
			<load arg="12"/>
			<get arg="13"/>
			<load arg="6"/>
			<call arg="14"/>
			<call arg="15"/>
			<if arg="16"/>
			<load arg="12"/>
			<call arg="17"/>
			<enditerate/>
			<iterate/>
			<store arg="12"/>
			<load arg="12"/>
			<get arg="18"/>
			<call arg="17"/>
			<enditerate/>
			<call arg="19"/>
			<get arg="18"/>
		</code>
		<linenumbertable>
			<lne id="35" begin="6" end="6"/>
			<lne id="36" begin="6" end="7"/>
			<lne id="37" begin="10" end="10"/>
			<lne id="38" begin="10" end="11"/>
			<lne id="39" begin="12" end="12"/>
			<lne id="40" begin="10" end="13"/>
			<lne id="41" begin="3" end="18"/>
			<lne id="42" begin="21" end="21"/>
			<lne id="43" begin="21" end="22"/>
			<lne id="44" begin="0" end="24"/>
			<lne id="45" begin="0" end="25"/>
			<lne id="46" begin="0" end="26"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="32" begin="9" end="17"/>
			<lve slot="2" name="33" begin="20" end="23"/>
			<lve slot="0" name="3" begin="0" end="26"/>
			<lve slot="1" name="13" begin="0" end="26"/>
		</localvariabletable>
	</operation>
	<operation name="47">
		<context type="5"/>
		<parameters>
			<parameter name="6" type="7"/>
		</parameters>
		<code>
			<push arg="8"/>
			<push arg="9"/>
			<new/>
			<push arg="8"/>
			<push arg="9"/>
			<new/>
			<load arg="10"/>
			<get arg="11"/>
			<iterate/>
			<store arg="12"/>
			<load arg="12"/>
			<get arg="13"/>
			<load arg="6"/>
			<call arg="14"/>
			<call arg="15"/>
			<if arg="16"/>
			<load arg="12"/>
			<call arg="17"/>
			<enditerate/>
			<iterate/>
			<store arg="12"/>
			<load arg="12"/>
			<get arg="18"/>
			<call arg="17"/>
			<enditerate/>
			<call arg="19"/>
			<get arg="18"/>
		</code>
		<linenumbertable>
			<lne id="48" begin="6" end="6"/>
			<lne id="49" begin="6" end="7"/>
			<lne id="50" begin="10" end="10"/>
			<lne id="51" begin="10" end="11"/>
			<lne id="52" begin="12" end="12"/>
			<lne id="53" begin="10" end="13"/>
			<lne id="54" begin="3" end="18"/>
			<lne id="55" begin="21" end="21"/>
			<lne id="56" begin="21" end="22"/>
			<lne id="57" begin="0" end="24"/>
			<lne id="58" begin="0" end="25"/>
			<lne id="59" begin="0" end="26"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="32" begin="9" end="17"/>
			<lve slot="2" name="33" begin="20" end="23"/>
			<lve slot="0" name="3" begin="0" end="26"/>
			<lve slot="1" name="13" begin="0" end="26"/>
		</localvariabletable>
	</operation>
	<operation name="60">
		<context type="5"/>
		<parameters>
			<parameter name="6" type="7"/>
		</parameters>
		<code>
			<push arg="8"/>
			<push arg="9"/>
			<new/>
			<load arg="10"/>
			<get arg="11"/>
			<iterate/>
			<store arg="12"/>
			<load arg="12"/>
			<get arg="13"/>
			<load arg="6"/>
			<call arg="14"/>
			<call arg="15"/>
			<if arg="61"/>
			<load arg="12"/>
			<call arg="17"/>
			<enditerate/>
			<call arg="19"/>
			<get arg="18"/>
			<get arg="62"/>
		</code>
		<linenumbertable>
			<lne id="63" begin="3" end="3"/>
			<lne id="64" begin="3" end="4"/>
			<lne id="65" begin="7" end="7"/>
			<lne id="66" begin="7" end="8"/>
			<lne id="67" begin="9" end="9"/>
			<lne id="68" begin="7" end="10"/>
			<lne id="69" begin="0" end="15"/>
			<lne id="70" begin="0" end="16"/>
			<lne id="71" begin="0" end="17"/>
			<lne id="72" begin="0" end="18"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="32" begin="6" end="14"/>
			<lve slot="0" name="3" begin="0" end="18"/>
			<lve slot="1" name="13" begin="0" end="18"/>
		</localvariabletable>
	</operation>
	<operation name="73">
		<context type="5"/>
		<parameters>
			<parameter name="6" type="7"/>
		</parameters>
		<code>
			<push arg="8"/>
			<push arg="9"/>
			<new/>
			<push arg="8"/>
			<push arg="9"/>
			<new/>
			<push arg="8"/>
			<push arg="9"/>
			<new/>
			<load arg="10"/>
			<get arg="11"/>
			<iterate/>
			<store arg="12"/>
			<load arg="12"/>
			<get arg="13"/>
			<load arg="6"/>
			<call arg="14"/>
			<call arg="15"/>
			<if arg="74"/>
			<load arg="12"/>
			<call arg="17"/>
			<enditerate/>
			<call arg="19"/>
			<get arg="18"/>
			<get arg="75"/>
			<iterate/>
			<store arg="12"/>
			<load arg="12"/>
			<push arg="76"/>
			<push arg="77"/>
			<findme/>
			<call arg="78"/>
			<call arg="15"/>
			<if arg="79"/>
			<load arg="12"/>
			<call arg="17"/>
			<enditerate/>
			<iterate/>
			<store arg="12"/>
			<load arg="12"/>
			<get arg="62"/>
			<call arg="17"/>
			<enditerate/>
			<call arg="80"/>
		</code>
		<linenumbertable>
			<lne id="81" begin="9" end="9"/>
			<lne id="82" begin="9" end="10"/>
			<lne id="83" begin="13" end="13"/>
			<lne id="84" begin="13" end="14"/>
			<lne id="85" begin="15" end="15"/>
			<lne id="86" begin="13" end="16"/>
			<lne id="87" begin="6" end="21"/>
			<lne id="88" begin="6" end="22"/>
			<lne id="89" begin="6" end="23"/>
			<lne id="90" begin="6" end="24"/>
			<lne id="91" begin="27" end="27"/>
			<lne id="92" begin="28" end="30"/>
			<lne id="93" begin="27" end="31"/>
			<lne id="94" begin="3" end="36"/>
			<lne id="95" begin="39" end="39"/>
			<lne id="96" begin="39" end="40"/>
			<lne id="97" begin="0" end="42"/>
			<lne id="98" begin="0" end="43"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="32" begin="12" end="20"/>
			<lve slot="2" name="99" begin="26" end="35"/>
			<lve slot="2" name="33" begin="38" end="41"/>
			<lve slot="0" name="3" begin="0" end="43"/>
			<lve slot="1" name="13" begin="0" end="43"/>
		</localvariabletable>
	</operation>
	<operation name="100">
		<context type="5"/>
		<parameters>
			<parameter name="6" type="7"/>
		</parameters>
		<code>
			<push arg="8"/>
			<push arg="9"/>
			<new/>
			<push arg="8"/>
			<push arg="9"/>
			<new/>
			<push arg="8"/>
			<push arg="9"/>
			<new/>
			<load arg="10"/>
			<get arg="11"/>
			<iterate/>
			<store arg="12"/>
			<load arg="12"/>
			<get arg="13"/>
			<load arg="6"/>
			<call arg="14"/>
			<call arg="15"/>
			<if arg="74"/>
			<load arg="12"/>
			<call arg="17"/>
			<enditerate/>
			<call arg="19"/>
			<get arg="18"/>
			<get arg="75"/>
			<iterate/>
			<store arg="12"/>
			<load arg="12"/>
			<push arg="101"/>
			<push arg="77"/>
			<findme/>
			<call arg="78"/>
			<call arg="15"/>
			<if arg="79"/>
			<load arg="12"/>
			<call arg="17"/>
			<enditerate/>
			<iterate/>
			<store arg="12"/>
			<load arg="12"/>
			<get arg="62"/>
			<call arg="17"/>
			<enditerate/>
			<call arg="80"/>
		</code>
		<linenumbertable>
			<lne id="102" begin="9" end="9"/>
			<lne id="103" begin="9" end="10"/>
			<lne id="104" begin="13" end="13"/>
			<lne id="105" begin="13" end="14"/>
			<lne id="106" begin="15" end="15"/>
			<lne id="107" begin="13" end="16"/>
			<lne id="108" begin="6" end="21"/>
			<lne id="109" begin="6" end="22"/>
			<lne id="110" begin="6" end="23"/>
			<lne id="111" begin="6" end="24"/>
			<lne id="112" begin="27" end="27"/>
			<lne id="113" begin="28" end="30"/>
			<lne id="114" begin="27" end="31"/>
			<lne id="115" begin="3" end="36"/>
			<lne id="116" begin="39" end="39"/>
			<lne id="117" begin="39" end="40"/>
			<lne id="118" begin="0" end="42"/>
			<lne id="119" begin="0" end="43"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="32" begin="12" end="20"/>
			<lve slot="2" name="99" begin="26" end="35"/>
			<lve slot="2" name="33" begin="38" end="41"/>
			<lve slot="0" name="3" begin="0" end="43"/>
			<lve slot="1" name="13" begin="0" end="43"/>
		</localvariabletable>
	</operation>
</asm>
