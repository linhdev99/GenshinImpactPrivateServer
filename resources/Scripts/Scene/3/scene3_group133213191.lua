local L0_1, L1_1, L2_1, L3_1, L4_1, L5_1, L6_1, L7_1
L0_1 = {}
L0_1.group_id = 133213191
L1_1 = {}
L1_1.loop_mode = 0
L1_1.group_ID = 133213191
L1_1.gadget_1 = 191001
L1_1.gadget_2 = 191002
L1_1.gadget_3 = 191003
L1_1.gadget_4 = 0
L1_1.gadget_5 = 0
L2_1 = {}
monsters = L2_1
L2_1 = {}
npcs = L2_1
L2_1 = {}
L3_1 = {}
L3_1.config_id = 191001
L3_1.gadget_id = 70330073
L4_1 = {}
L4_1.x = -3377.517
L4_1.y = 225.077
L4_1.z = -3700.741
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 346.843
L4_1.y = 332.016
L4_1.z = 5.981
L3_1.rot = L4_1
L3_1.level = 30
L4_1 = GadgetState
L4_1 = L4_1.Action01
L3_1.state = L4_1
L3_1.area_id = 12
L2_1[191001] = L3_1
L3_1 = {}
L3_1.config_id = 191002
L3_1.gadget_id = 70330074
L4_1 = {}
L4_1.x = -3371.555
L4_1.y = 224.442
L4_1.z = -3699.19
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 8.591
L4_1.y = 190.274
L4_1.z = 8.942
L3_1.rot = L4_1
L3_1.level = 30
L4_1 = GadgetState
L4_1 = L4_1.Action02
L3_1.state = L4_1
L3_1.area_id = 12
L2_1[191002] = L3_1
L3_1 = {}
L3_1.config_id = 191003
L3_1.gadget_id = 70330073
L4_1 = {}
L4_1.x = -3365.908
L4_1.y = 222.998
L4_1.z = -3702.66
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 6.644
L4_1.y = 219.089
L4_1.z = 14.77
L3_1.rot = L4_1
L3_1.level = 30
L4_1 = GadgetState
L4_1 = L4_1.Action03
L3_1.state = L4_1
L3_1.area_id = 12
L2_1[191003] = L3_1
L3_1 = {}
L3_1.config_id = 191006
L3_1.gadget_id = 70211111
L4_1 = {}
L4_1.x = -3372.901
L4_1.y = 224.09
L4_1.z = -3705.4
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 6.652
L4_1.y = 191.25
L4_1.z = 4.003
L3_1.rot = L4_1
L3_1.level = 26
L3_1.drop_tag = "\232\167\163\232\176\156\228\184\173\231\186\167\231\168\187\229\166\187"
L3_1.isOneoff = true
L3_1.persistent = true
L4_1 = {}
L4_1.name = "chest"
L4_1.exp = 1
L3_1.explore = L4_1
L3_1.area_id = 12
L2_1[191006] = L3_1
gadgets = L2_1
L2_1 = {}
regions = L2_1
L2_1 = {}
L3_1 = {}
L3_1.config_id = 1191004
L3_1.name = "VARIABLE_CHANGE_191004"
L4_1 = EventType
L4_1 = L4_1.EVENT_VARIABLE_CHANGE
L3_1.event = L4_1
L3_1.source = ""
L3_1.condition = "condition_EVENT_VARIABLE_CHANGE_191004"
L3_1.action = "action_EVENT_VARIABLE_CHANGE_191004"
L2_1[1] = L3_1
triggers = L2_1
L2_1 = {}
variables = L2_1
L2_1 = {}
L2_1.suite = 1
L2_1.end_suite = 0
L2_1.rand_suite = false
init_config = L2_1
L2_1 = {}
L3_1 = {}
L4_1 = {}
L3_1.monsters = L4_1
L4_1 = {}
L5_1 = 191001
L6_1 = 191002
L7_1 = 191003
L4_1[1] = L5_1
L4_1[2] = L6_1
L4_1[3] = L7_1
L3_1.gadgets = L4_1
L4_1 = {}
L3_1.regions = L4_1
L4_1 = {}
L5_1 = "VARIABLE_CHANGE_191004"
L4_1[1] = L5_1
L3_1.triggers = L4_1
L3_1.rand_weight = 100
L4_1 = {}
L5_1 = {}
L4_1.monsters = L5_1
L5_1 = {}
L6_1 = 191006
L5_1[1] = L6_1
L4_1.gadgets = L5_1
L5_1 = {}
L4_1.regions = L5_1
L5_1 = {}
L4_1.triggers = L5_1
L4_1.rand_weight = 100
L2_1[1] = L3_1
L2_1[2] = L4_1
suites = L2_1
function L2_1(A0_2, A1_2)
  local L2_2, L3_2, L4_2
  L2_2 = A1_2.param1
  L3_2 = A1_2.param2
  if L2_2 == L3_2 then
    L2_2 = false
    return L2_2
  end
  L2_2 = ScriptLib
  L2_2 = L2_2.GetGroupVariableValue
  L3_2 = A0_2
  L4_2 = "successed"
  L2_2 = L2_2(L3_2, L4_2)
  if L2_2 ~= 1 then
    L2_2 = false
    return L2_2
  end
  L2_2 = true
  return L2_2
end
condition_EVENT_VARIABLE_CHANGE_191004 = L2_1
function L2_1(A0_2, A1_2)
  local L2_2, L3_2, L4_2, L5_2, L6_2
  L2_2 = ScriptLib
  L2_2 = L2_2.SetGroupVariableValueByGroup
  L3_2 = A0_2
  L4_2 = "finish"
  L5_2 = 1
  L6_2 = 133213495
  L2_2 = L2_2(L3_2, L4_2, L5_2, L6_2)
  if 0 ~= L2_2 then
    L2_2 = ScriptLib
    L2_2 = L2_2.PrintContextLog
    L3_2 = A0_2
    L4_2 = "@@ LUA_WARNING : set_groupVariable_by_group"
    L2_2(L3_2, L4_2)
    L2_2 = -1
    return L2_2
  end
  L2_2 = 0
  return L2_2
end
action_EVENT_VARIABLE_CHANGE_191004 = L2_1
L2_1 = require
L3_1 = "BlackBoxPlay/LightResonanceStone"
L2_1(L3_1)
